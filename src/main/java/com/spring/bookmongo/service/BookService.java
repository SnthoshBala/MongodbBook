package com.spring.bookmongo.service;

import com.spring.bookmongo.model.Book;
import com.spring.bookmongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> book) {
        return repository.saveAll(book);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookById(String id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteBook(String id) {
        repository.deleteById(id);
        return "Book removed !! " + id;
    }

    public Book updateBook(Book book) {
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setPrice(book.getPrice());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setCoverPhotoURL(book.getCoverPhotoURL());
        existingBook.setLanguage(book.getLanguage());
        existingBook.setIsbnNumber(book.getIsbnNumber());
        existingBook.setTitle(book.getTitle());
        return repository.save(existingBook);
    }


}
