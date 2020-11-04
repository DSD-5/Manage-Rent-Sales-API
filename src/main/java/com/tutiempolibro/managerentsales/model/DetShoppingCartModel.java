package com.tutiempolibro.managerentsales.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity(name = "det_carrito_tmp")
@IdClass(DetShoppingCartIdentity.class)
@Data
public class DetShoppingCartModel {

    @Id
    private Integer idcarrito;

    @Id
    private Integer idlibro;

    private Integer cantidad;

    private String tipo;

    private Double subtotal;

}
