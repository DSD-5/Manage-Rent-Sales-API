package com.tutiempolibro.managerentsales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.DetShoppingCartModel;

@Repository
public interface DetShoppingCartRepository extends JpaRepository<DetShoppingCartModel, Integer> {

    public List<DetShoppingCartModel> findByIdcarrito(Integer idcarrito);

}
