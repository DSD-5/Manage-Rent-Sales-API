package com.tutiempolibro.managerentsales.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="alquiler")
@Data
public class RentModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalquiler;
    
    private String codalquiler;
    
    private String codlibfis;
    
    private Integer idcliente;
    
    private Integer idsuscripcion;
    
    @Column(name="fecha_emision")
    private Date fechaemision;
    
    @Column(name="fecha_entrega")
    private Date fechaentrega;
    
    private String estado;
    
    private Integer iddelivery;
    
    @Column(name="direccion_entrega")
    private String direccionentrega;
    
    private String referencia;
    
    
}
