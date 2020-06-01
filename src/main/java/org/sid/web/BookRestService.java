package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.BookRepository;
import org.sid.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class BookRestService {
	
	@Autowired
	private BookRepository bookRepo;
	
	//GET ALL BOOKS
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<Book> getBooks(){
		return bookRepo.findAll();
	}
	
	//GET ALL BOOKS BY PRICE ASC
		@RequestMapping(value="/books-by-price-asc", method = RequestMethod.GET)
		public List<Book> getBooksByPriceAsc(){
			return bookRepo.findAll(Sort.by(Sort.Direction.ASC,"price"));
		}
	
	//GET ALL BOOKS BY PRICE DESC
		@RequestMapping(value="/books-by-price-desc", method = RequestMethod.GET)
		public List<Book> getBooksByPriceDesc(){
			return bookRepo.findAll(Sort.by(Sort.Direction.DESC,"price"));		
		}
		
	//GET ALL BOOKS Note
		@RequestMapping(value="/books-by-note", method = RequestMethod.GET)
		public List<Book> getBooksByNoteDesc(){
			return bookRepo.findAll(Sort.by(Sort.Direction.DESC,"note"));				
		}
	
	// GET BOOK BY ID
	@RequestMapping(value="/books/{id}", method = RequestMethod.GET)
	public Optional<Book> getBook(@PathVariable Long id){
		return bookRepo.findById(id);
	}
	
	// ADD USER
	@RequestMapping(value="/books", method = RequestMethod.POST)
	public Book addBook(@RequestBody Book b) {
		return bookRepo.save(b);
	}
	
	// DELETE USER 
	@RequestMapping(value="books/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable Long id) {
		bookRepo.deleteById(id);
	}
	
	// UPDATE BOOK 
		@RequestMapping(value="books/{id}",method = RequestMethod.PUT)
		public Book updateUser(@PathVariable Long id, @RequestBody Book b ) {
			b.setId(id);
			return bookRepo.save(b);
		}

}
