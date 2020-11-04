package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="persona")
@Data
public class PersonModel {
    
    @Id
    private Integer idpersona;
    private String  nombres;
    private String apepat;
    private String apemat;
}
