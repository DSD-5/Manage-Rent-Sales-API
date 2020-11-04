package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.SuscriptionModel;
import java.util.List;
@Repository
public interface SuscriptionRepository extends JpaRepository<SuscriptionModel, Integer> {
    
    public List<SuscriptionModel> findByIdclienteAndEstado(Integer idcliente, String estado);
    
}
