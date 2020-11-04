package com.tutiempolibro.managerentsales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.PhysicalBookModel;

@Repository
public interface PhysicalBookRepository   extends JpaRepository<PhysicalBookModel, Integer> {

    public List<PhysicalBookModel> findByIdlibroAndEstado(Integer idlibro, String estado);
    
}
