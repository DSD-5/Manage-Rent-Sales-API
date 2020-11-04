package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "libro")
@Data
public class BookModel {
    
    @Id
    private Integer idlibro;

    private String nombre;

    private String descripcion;

    private Integer idcategoria;

    private Integer stockventa;

    private Integer stockalquiler;

    private String tipo;

    private Integer idautor;

    private String estado;

    private Double costoalquiler;

    private Double costoventa;
    
}
