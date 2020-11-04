package com.tutiempolibro.managerentsales.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.ShoppingCartModel;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCartModel , Integer>{
    
    public Optional<ShoppingCartModel> findById(Integer idcarrito);
    
}
