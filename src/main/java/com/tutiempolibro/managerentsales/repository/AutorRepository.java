package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.PersonModel;

@Repository
public interface AutorRepository extends JpaRepository<PersonModel, Integer>{

}
