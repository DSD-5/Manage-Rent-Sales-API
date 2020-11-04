package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutiempolibro.managerentsales.model.PlansModel;

public interface PlantRepository   extends JpaRepository<PlansModel, Integer> {
    
    
}
