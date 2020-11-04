package com.tutiempolibro.managerentsales.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.DeliveryModel;

@Repository
public interface DeliveryRepository  extends JpaRepository<DeliveryModel, Integer> {
    
    public Optional<DeliveryModel> findById(Integer iddelivery);
    
}
