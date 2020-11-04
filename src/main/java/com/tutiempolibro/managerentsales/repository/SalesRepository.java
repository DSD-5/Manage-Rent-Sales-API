package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutiempolibro.managerentsales.model.SalesIdentity;
import com.tutiempolibro.managerentsales.model.SalesModel;

public interface SalesRepository   extends JpaRepository<SalesModel, SalesIdentity> {

}
