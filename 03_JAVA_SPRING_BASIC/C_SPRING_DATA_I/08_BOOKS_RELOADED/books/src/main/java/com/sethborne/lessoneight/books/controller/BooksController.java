package com.sethborne.lessoneight.books.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.lessoneight.books.models.Book;
import com.sethborne.lessoneight.books.services.BookService;

@Controller

public class BooksController {
	
	private final BookService bookService;
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "newBook.jsp";
	}
	
	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "newBook.jsp";
		}
		else {
			//add the freaking book, son!
			bookService.addBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBookById(id);
		if (book != null) {
			model.addAttribute("book", book);
			return "editBook.jsp";
		}
		else {
			return "redirect:/books";
		}
	}
	
	@PostMapping("/books/edit/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "editBook.jsp";
		}
		else {
//			Date saveCurrentTime = book.getCreatedat();
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping(value="/books/delete/{id}")
	public String destroyBook(@PathVariable("id") Long id) {
		bookService.destroyBook(id);
		return "redirect:/books";
	}
	
	
	@RequestMapping("/books")
	public String books(Model model) {
//		List<Book> books = new ArrayList(Arrays.asList(
//			new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
//	        new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
//	        new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
//	        new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
//	        new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
//		));
		//this is bad in a controller!
		List<Book> books = bookService.allBooks();
		System.out.println(books);
		model.addAttribute("books", books);
		return "books.jsp";
	}
	@RequestMapping("/books/{id}")
	public String findBookById(Model model, @PathVariable("id") Long id) {
		Book book = bookService.findBookById(id);
		model.addAttribute("book", book);
		return "showBook.jsp";
	}
}