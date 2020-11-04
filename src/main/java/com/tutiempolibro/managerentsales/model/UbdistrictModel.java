package com.tutiempolibro.managerentsales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="ubdistrito")
@Data
public class UbdistrictModel {
    
    @Id
    @Column(name="iddist")
    private Integer iddistrito;
    
    @Column(name="distrito")
    private String descripcion;
    
    @Column(name="idprov")
    private Integer idprovincia;
    
}
