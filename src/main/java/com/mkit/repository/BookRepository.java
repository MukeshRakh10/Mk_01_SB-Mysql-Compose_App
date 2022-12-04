package com.mkit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkit.entity.Book;


public interface BookRepository extends JpaRepository<Book, Serializable> {

}
