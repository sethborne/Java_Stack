package com.sethborne.lessoneight.books.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.lessoneight.books.models.Book;
import com.sethborne.lessoneight.books.repositories.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// method to return all books
	public List<Book> allBooks(){
//		return books;
		return (List<Book>) bookRepository.findAll();
	}
	
	public void addBook(Book book) {
//		books.add(book);
		bookRepository.save(book);
	}
	
	public void updateBook(Book book) {
//		if (id < books.size()) {
//			books.set(id, book);
//		}
//		book.onUpdate();
		bookRepository.save(book);
	}
	public void destroyBook(Long id) {
//		if(id < bookRepository.count()) {
			bookRepository.delete(id);
//		}
	}
	
	public Book findBookById(Long id) {
		return bookRepository.findOne(id);
		//check to see if the index is in range
//		if(index < books.size()) {
//			return books.get(index);
//		} else {
//			return null;
//		}
	}
}
