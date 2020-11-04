package com.tutiempolibro.managerentsales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="ubdepartamento")
@Data
public class UbdepartamentoModel {
    
    @Id
    @Column(name="iddepa")
    private Integer iddepartamento;
    
    @Column(name="departamento")
    private String descripcion;
    
}
