package com.tutiempolibro.managerentsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.managerentsales.model.BookModel;

@Repository
public interface BookRepository  extends JpaRepository<BookModel, Integer> {

}
