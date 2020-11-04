package com.tutiempolibro.managerentsales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="ubprovincia")
@Data
public class UbprovinciaModel {
    
    @Id
    @Column(name="idprov")
    private Integer idprovincia;
    
    @Column(name="provincia")
    private String descripcion;
    
    @Column(name="iddepa")
    private Integer iddepartamento;
}
