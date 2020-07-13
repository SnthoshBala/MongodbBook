package com.spring.bookmongo.repository;

import com.spring.bookmongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}