package com.tutiempolibro.managerentsales.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="carrito_tmp")
@Data
public class ShoppingCartModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcarrito;
    
    private Integer idcliente;
    
    private String estado;
    
    private Date fecha;
    
    private Double total;
    
    private Integer iddelivery;
    
    private Double costodelivery;
    
    private Double subtotalventa;
    
    private Double subtotalalquiler;
    
    private Double descuentoventa;
    
    private Double descuentoalquiler;
    
    private Date fechaactualizacion;
}
