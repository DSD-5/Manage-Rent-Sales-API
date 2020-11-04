package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutiempolibro.managerentsales.model.UbdepartamentoModel;

public interface DepartamentRepository  extends JpaRepository<UbdepartamentoModel, Integer> {

}
