package com.tutiempolibro.managerentsales.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class PhysicalBookIdentity implements Serializable{

    
    public PhysicalBookIdentity() {
	
	// TODO Auto-generated constructor stub
    }

    

    public PhysicalBookIdentity(Integer idlibro, String codlibro) {
	super();
	this.idlibro = idlibro;
	this.codlibro = codlibro;
    }



    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer idlibro;

    private String codlibro;
    
}
