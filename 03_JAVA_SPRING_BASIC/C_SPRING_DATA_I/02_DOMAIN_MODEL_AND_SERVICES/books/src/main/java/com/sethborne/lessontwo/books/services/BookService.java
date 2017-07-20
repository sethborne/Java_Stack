package com.sethborne.lessontwo.books.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.lessontwo.books.models.Book;

@Service
public class BookService {
	
	//initialize the books variable with values
	private List<Book> books = new ArrayList(Arrays.asList(
		new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
	    new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
	    new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
	    new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
	    new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
	));
	
	// method to return all books
	public List<Book> allBooks(){
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void updateBook(int id, Book book) {
		if (id < books.size()) {
			books.set(id, book);
		}
	}
	public void deleteBook(int id) {
		if(id < books.size()) {
			books.remove(id);
		}
	}
	
	public Book findBookByIndex(int index) {
		//check to see if the index is in range
		if(index < books.size()) {
			return books.get(index);
		} else {
			return null;
		}
	}
}
