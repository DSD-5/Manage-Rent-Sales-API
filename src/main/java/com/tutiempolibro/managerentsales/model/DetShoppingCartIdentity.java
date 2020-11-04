package com.tutiempolibro.managerentsales.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class DetShoppingCartIdentity implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer idcarrito;

    private Integer idlibro;
    
    public DetShoppingCartIdentity() {
	
    }
    
    
    public DetShoppingCartIdentity(Integer idcarrito, Integer idlibro) {
	super();
	this.idcarrito = idcarrito;
	this.idcarrito = idlibro;
    }

    
}
