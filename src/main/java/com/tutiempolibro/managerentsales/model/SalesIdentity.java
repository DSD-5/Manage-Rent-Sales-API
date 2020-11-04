package com.tutiempolibro.managerentsales.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class SalesIdentity implements Serializable{
    
    
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Integer idcarrito;
    private String codlibfis;
    private String codventa;
    public SalesIdentity(Integer idcarrito, String codlibfis, String codventa) {
	super();
	this.idcarrito = idcarrito;
	this.codlibfis = codlibfis;
	this.codventa = codventa;
    }
    public SalesIdentity() {
	// TODO Auto-generated constructor stub
    }
    
    
}
