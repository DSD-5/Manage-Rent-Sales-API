package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="suscripcion")
@Data
public class SuscriptionModel {
    
    @Id
    private Integer idsuscripcion;
    
    private Integer idcliente;
    
    private Integer idplan;
    
    private String estado;
    
}
