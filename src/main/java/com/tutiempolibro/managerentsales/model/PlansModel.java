package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="planes")
@Data
public class PlansModel {
    
    @Id
    private Integer idplan;
    
    private String descripcion;
    
    private Integer promoalquiler;
    
    private Integer promoventa;
}
