package com.tutiempolibro.managerentsales.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.managerentsales.commons.Util;
import com.tutiempolibro.managerentsales.model.BookModel;
import com.tutiempolibro.managerentsales.model.DeliveryModel;
import com.tutiempolibro.managerentsales.model.DetShoppingCartModel;
import com.tutiempolibro.managerentsales.model.PersonModel;
import com.tutiempolibro.managerentsales.model.PhysicalBookModel;
import com.tutiempolibro.managerentsales.model.PlansModel;
import com.tutiempolibro.managerentsales.model.RentModel;
import com.tutiempolibro.managerentsales.model.SalesModel;
import com.tutiempolibro.managerentsales.model.ShoppingCartModel;
import com.tutiempolibro.managerentsales.model.SuscriptionModel;
import com.tutiempolibro.managerentsales.repository.AutorRepository;
import com.tutiempolibro.managerentsales.repository.BookRepository;
import com.tutiempolibro.managerentsales.repository.DeliveryRepository;
import com.tutiempolibro.managerentsales.repository.DepartamentRepository;
import com.tutiempolibro.managerentsales.repository.DetShoppingCartRepository;
import com.tutiempolibro.managerentsales.repository.DistrictRepository;
import com.tutiempolibro.managerentsales.repository.PhysicalBookRepository;
import com.tutiempolibro.managerentsales.repository.PlantRepository;
import com.tutiempolibro.managerentsales.repository.ProvinceRepository;
import com.tutiempolibro.managerentsales.repository.RentRepository;
import com.tutiempolibro.managerentsales.repository.SalesRepository;
import com.tutiempolibro.managerentsales.repository.ShoppingCartRepository;
import com.tutiempolibro.managerentsales.repository.SuscriptionRepository;
import com.tutiempolibro.managerentsales.types.PurchaseDetailRefType;
import com.tutiempolibro.managerentsales.types.SummaryPurchaseType;

@Service
public class RentSalesBusiness {

    @Autowired
    private DetShoppingCartRepository detShoppingCartRepo;

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private ShoppingCartRepository shoppingCartRepo;

    @Autowired
    private DeliveryRepository deliveryRepo;

    @Autowired
    private DepartamentRepository departamentRepo;

    @Autowired
    private ProvinceRepository provinceRepo;

    @Autowired
    private DistrictRepository districtRepo;

    @Autowired
    private PhysicalBookRepository physicalBookRepo;

    @Autowired
    private SalesRepository salesRepo;

    @Autowired
    private RentRepository rentRepo;

    @Autowired
    private SuscriptionRepository suscriptionRepo;

    @Autowired
    private PlantRepository plantRepo;

    public SummaryPurchaseType rentSalesBook(Integer suscriptionId, Integer shoppingId, Integer deliveryId, String direction,
	    String reference, Boolean preview, String authorization) {
	// TODO Auto-generated method stub
	SummaryPurchaseType resp = new SummaryPurchaseType();
	// 1. Determinar tipo de Operacion
	if (preview) {
	    showResumenPurchase(shoppingId, deliveryId, direction, reference, resp);
	} else {
	    processRentSalesOrder(suscriptionId, shoppingId, deliveryId, direction, reference, authorization, resp);
	}

	return resp;
    }

    private void processRentSalesOrder(Integer suscriptionId, Integer shoppingId, Integer deliveryId, String direction, String reference,
	    String authorization, SummaryPurchaseType resp) {
	// TODO Auto-generated method stub

	// buscar detalle shopping cart
	Optional<ShoppingCartModel> optShoppingCart = shoppingCartRepo.findById(shoppingId);
	
	// Buscar suscripcion
	List<SuscriptionModel> lsus = suscriptionRepo.findByIdclienteAndEstado(optShoppingCart.get().getIdcliente(), "1"); // 1= Habilitado
															   // / 0 =
															   // Deshabilitado

	// Obtener el plan
	Optional<PlansModel> optPlan = plantRepo.findById(lsus.get(0).getIdplan());
	Double descAlquiler = optPlan.get().getPromoalquiler() * 1.0;
	Double descVenta = optPlan.get().getPromoventa() * 1.0;
	Double total = new Double("0.0");
	Double totalAlquiler = new Double("0.0");
	Double totalVenta = new Double("0.0");
	
	Optional<DeliveryModel> optDelivery = deliveryRepo.findById(deliveryId);
	    if (optDelivery.isPresent()) {
		total += optDelivery.get().getCost();
		resp.setDelivery(total);
	    }
	
	// Recorro detalle
	List<DetShoppingCartModel> lshoppingCart = detShoppingCartRepo.findByIdcarrito(shoppingId);

	String codVenta = Util.returnCodAutogenerate("VEN", optShoppingCart.get().getIdcliente().toString());
	String codAlquiler = Util.returnCodAutogenerate("ALQ", optShoppingCart.get().getIdcliente().toString());

	for (DetShoppingCartModel d : lshoppingCart) {
	    int contVenta = 0;
	    int contAlquiler = 0;
	    // Obtengo lista de libros disponibles
	    List<PhysicalBookModel> librosFisicos = physicalBookRepo.findByIdlibroAndEstado(d.getIdlibro(), "1"); // Obtener los disponibles
	    // actualizo estado libro fisico por tipo de operacion V o A
	    // VENTA
	    if (d.getTipo().equals("V")) {
		int contadorVentaDetalle = d.getCantidad();
		for (PhysicalBookModel pl : librosFisicos) {

		    if (pl.getTipo().equals("V")) {
			System.out.println("Registrando en venta============");
			SalesModel entity = new SalesModel();
			entity.setCodlibfis(pl.getCodlibro());
			System.out.println("pl.getCodlibro() : " + pl.getCodlibro());
			entity.setCodventa(codVenta.toUpperCase());
			System.out.println("codVenta : " + codVenta.toUpperCase());
			entity.setEstado("1"); // cerrado
			entity.setIdcarrito(d.getIdcarrito());
			System.out.println("d.getIdcarrito() : " + d.getIdcarrito());
			// entity.setSubtotal(d.getSubtotal());
			// Registro en Venta
			salesRepo.save(entity);

			// Actualizo estado del libro fisico
			pl.setEstado("0"); // No disponible
			physicalBookRepo.save(pl);
			totalVenta += Double.valueOf(d.getSubtotal());
			contVenta++;
			if(contVenta == contadorVentaDetalle)
			break;
		    }

		}

	    } else {

		for (PhysicalBookModel pl : librosFisicos) {

		    if (pl.getTipo().equals("A")) {

			// Registro en Alquiler
			RentModel entity = new RentModel();
			entity.setCodlibfis(pl.getCodlibro());
			entity.setCodalquiler(codAlquiler.toUpperCase());
			entity.setIdcliente(optShoppingCart.get().getIdcliente());
			entity.setIdsuscripcion(lsus.get(0).getIdsuscripcion());
			entity.setFechaentrega(Util.sumarRestarDiasFecha(new Date(), 30));
			entity.setFechaemision(new Date());
			entity.setEstado("1"); // 1 = PENDIENTE / 0 = CERRADO
			entity.setIddelivery(deliveryId);
			entity.setDireccionentrega(direction);
			entity.setReferencia(reference);
			rentRepo.save(entity);

			// Actualizo estado del libro fisico
			pl.setEstado("0"); // 1= disponible / 0 = No disponible
			physicalBookRepo.save(pl);
			
			totalAlquiler += Double.valueOf(d.getSubtotal());
			
			contAlquiler++;
			break;
		    }

		}

	    }

	    // actualizo stock de los libros
	    Optional<BookModel> optLibro = bookRepo.findById(d.getIdlibro());
	    optLibro.get().setIdlibro(d.getIdlibro());
	    optLibro.get().setStockventa(optLibro.get().getStockventa() - contVenta);
	    optLibro.get().setStockalquiler(optLibro.get().getStockalquiler() - contAlquiler);
	    bookRepo.save(optLibro.get());
	    
	}
	
	optShoppingCart.get().setSubtotalventa(totalVenta);
	optShoppingCart.get().setSubtotalalquiler(totalAlquiler);
	
	if (descAlquiler > 0) {
	    descAlquiler = (double) ((totalAlquiler * descAlquiler) / 100);
	    resp.setTotaldescalquier(descAlquiler);
	    resp.setSubtotalalquiler(totalAlquiler);
	    totalAlquiler -= descAlquiler;
	}else {
	    resp.setTotaldescalquier(descAlquiler);
	    resp.setSubtotalalquiler(totalAlquiler);
	}

	if (descVenta > 0) {
	    descVenta = (double) ((totalVenta * descVenta) / 100);
	    resp.setTotaldescventa(descVenta);
	    resp.setSubtotalventa(totalVenta);
	    totalVenta -= descVenta;
	}else {
	    resp.setTotaldescalquier(descVenta);
	    resp.setSubtotalalquiler(totalVenta);
	}
	
	total += totalAlquiler + totalVenta;
	optShoppingCart.get().setIdcarrito(shoppingId);
	optShoppingCart.get().setIddelivery(deliveryId);
	optShoppingCart.get().setCostodelivery(optDelivery.get().getCost());
	optShoppingCart.get().setDescuentoalquiler(descAlquiler);
	optShoppingCart.get().setDescuentoventa(descVenta);
	optShoppingCart.get().setEstado("C"); // C = Cerrado / P = Pendiente
	optShoppingCart.get().setFechaactualizacion(new Date());
	optShoppingCart.get().setTotal(total);
	shoppingCartRepo.save(optShoppingCart.get());
	
	resp.setCodalquiler(codAlquiler.toUpperCase());
	resp.setCodventa(codVenta.toUpperCase());
	resp.setTotal(total);
	
	resp.setDepartamento(departamentRepo.findById(Integer.parseInt(optDelivery.get().getDepartament())).get().getDescripcion());
	resp.setProvince(provinceRepo.findById(Integer.parseInt(optDelivery.get().getProvince())).get().getDescripcion());
	resp.setDistrict(districtRepo.findById(Integer.parseInt(optDelivery.get().getDistrict())).get().getDescripcion());
	resp.setDirection(direction);
	resp.setReference(reference);
	

    }

    private void showResumenPurchase(Integer shoppingId, Integer deliveryId, String direction, String reference, SummaryPurchaseType resp) {
	// TODO Auto-generated method stub

	Optional<ShoppingCartModel> optShoppingCart = shoppingCartRepo.findById(shoppingId);
	List<SuscriptionModel> lsuscription = suscriptionRepo.findByIdclienteAndEstado(optShoppingCart.get().getIdcliente(), "1");
	Optional<PlansModel> optPlan = plantRepo.findById(lsuscription.get(0).getIdplan());

	resp.setDescuentoalquiler(optPlan.get().getPromoalquiler() + "%");
	resp.setDescuentoventa(optPlan.get().getPromoventa() + "%");
	Double descAlquiler = optPlan.get().getPromoalquiler() * 1.0;
	Double descVenta = optPlan.get().getPromoventa() * 1.0;
	Double total = new Double("0.0");
	if (optShoppingCart.isPresent()) {
	    // cabecera
	    ShoppingCartModel shoppingCart = optShoppingCart.get();
	    resp.setFecha(shoppingCart.getFecha().toString());
	    resp.setEstado(shoppingCart.getEstado());
	    resp.setDirection(direction);
	    resp.setReference(reference);
	    // Delivery
	    Optional<DeliveryModel> optDelivery = deliveryRepo.findById(deliveryId);
	    if (optDelivery.isPresent()) {
		total += optDelivery.get().getCost();
		resp.setDelivery(total);
		resp.setDepartamento(departamentRepo.findById(Integer.parseInt(optDelivery.get().getDepartament())).get().getDescripcion());
		resp.setProvince(provinceRepo.findById(Integer.parseInt(optDelivery.get().getProvince())).get().getDescripcion());
		resp.setDistrict(districtRepo.findById(Integer.parseInt(optDelivery.get().getDistrict())).get().getDescripcion());
	    }

	    // detalle
	    List<PurchaseDetailRefType> purchaseDetailType = retrieveDetailItemsShoppingCart(shoppingId, resp, descAlquiler, descVenta);
	    resp.setTotal(resp.getTotal() + total);
	    resp.setPurchaseDetailType(purchaseDetailType);
	}

    }

    private List<PurchaseDetailRefType> retrieveDetailItemsShoppingCart(Integer shoppingId, SummaryPurchaseType resp, Double descAlquiler,
	    Double descVenta) {
	List<DetShoppingCartModel> lshoppingCart = detShoppingCartRepo.findByIdcarrito(shoppingId);
	List<PurchaseDetailRefType> purchaseDetailType = new ArrayList<PurchaseDetailRefType>();

	Double totalventa = new Double("0.0");
	Double totalalquiler = new Double("0.0");
	for (DetShoppingCartModel d : lshoppingCart) {
	    PurchaseDetailRefType p = new PurchaseDetailRefType();

	    Optional<BookModel> bOptional = bookRepo.findById(d.getIdlibro());
	    if (bOptional.isPresent()) {
		BookModel book = bOptional.get();
		Optional<PersonModel> aOptional = autorRepo.findById(book.getIdautor());
		PersonModel autor = aOptional.get();
		p.setAutor(autor.getNombres() + " " + autor.getApemat() + " " + autor.getApemat());
		p.setDescription(book.getDescripcion());
		p.setPrice(d.getTipo().equals("A") ? book.getCostoalquiler().toString() : book.getCostoventa().toString());
		p.setType(d.getTipo());
		p.setQuantity(d.getCantidad());
		p.setShoppingid(d.getIdcarrito().toString());
		p.setSubtotal((d.getCantidad() * Double.valueOf(p.getPrice())) + "");
		p.setUrlimage("por definir");
		p.setTitle(book.getNombre());
		purchaseDetailType.add(p);
		// total += Double.valueOf(p.getSubtotal());
		if (d.getTipo().equals("A"))
		    totalalquiler += Double.valueOf(p.getSubtotal());
		else
		    totalventa += Double.valueOf(p.getSubtotal());

	    }

	}

	if (descAlquiler > 0) {
	    descAlquiler = (double) ((totalalquiler * descAlquiler) / 100);
	    resp.setTotaldescalquier(descAlquiler);
	    resp.setSubtotalalquiler(totalalquiler);
	    totalalquiler -= descAlquiler;
	}else {
	    resp.setTotaldescalquier(descAlquiler);
	    resp.setSubtotalalquiler(totalalquiler);
	    
	}

	if (descVenta > 0) {
	    descVenta = (double) ((totalventa * descVenta) / 100);
	    resp.setTotaldescventa(descVenta);
	    resp.setSubtotalventa(totalventa);
	    totalventa -= descVenta;
	}else {
	    resp.setTotaldescventa(descVenta);
	    resp.setSubtotalventa(totalventa);
	}

	resp.setTotal(totalalquiler + totalventa);
	return purchaseDetailType;
    }

}
