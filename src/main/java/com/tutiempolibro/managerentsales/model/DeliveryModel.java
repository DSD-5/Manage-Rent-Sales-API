package com.tutiempolibro.managerentsales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="delivery")
@Data
public class DeliveryModel {
    
    @Id
    private Integer iddelivery;
    
    @Column(name="costo")
    private Double cost;
    
    @Column(name="departamento")
    private String departament;
    
    @Column(name="provincia")
    private String province;
    
    @Column(name="distrito")
    private String district;
    
}
