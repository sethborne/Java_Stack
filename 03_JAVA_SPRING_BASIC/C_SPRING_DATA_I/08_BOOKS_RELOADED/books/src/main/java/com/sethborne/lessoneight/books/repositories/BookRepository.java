package com.sethborne.lessoneight.books.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.lessoneight.books.models.Book;

@Repository

public interface BookRepository extends CrudRepository<Book, Long> {

}
