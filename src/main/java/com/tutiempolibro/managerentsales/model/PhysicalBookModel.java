package com.tutiempolibro.managerentsales.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity(name = "libro_fisico")
@IdClass(PhysicalBookIdentity.class)
@Data
public class PhysicalBookModel {
    
    @Id
    @Column(name="idlibro")
    private Integer idlibro;
    
    @Id
    @Column(name="codlibfis")
    private String codlibro;
    
    @Column(name="tipo")
    private String tipo;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="fechaingreso")
    private Date fechaingreso;
    
}
