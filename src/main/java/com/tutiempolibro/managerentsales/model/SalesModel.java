package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity(name = "venta")
@IdClass(SalesIdentity.class)
@Data
public class SalesModel {
    
    @Id
    private Integer idcarrito;
    
    @Id
    private String codventa;
    
    @Id
    private String codlibfis;
    
    private String estado;
    
    private Double subtotal;
    
}
