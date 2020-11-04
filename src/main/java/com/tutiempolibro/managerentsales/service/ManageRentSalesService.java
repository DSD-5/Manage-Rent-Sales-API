package com.tutiempolibro.managerentsales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.managerentsales.business.RentSalesBusiness;
import com.tutiempolibro.managerentsales.types.SummaryPurchaseType;

@Service
public class ManageRentSalesService implements IManageRentSalesService {
    @Autowired
    private RentSalesBusiness rentSalesBusiness;
    
    @Override
    public SummaryPurchaseType rentSalesBook(Integer suscriptionId, Integer shoppingId, Integer deliveryId, String direction,
	    String reference, Boolean preview, String authorization) {
	// TODO Auto-generated method stub
	return rentSalesBusiness.rentSalesBook(suscriptionId, shoppingId, deliveryId, direction, reference, preview, authorization);
    }

	
}
