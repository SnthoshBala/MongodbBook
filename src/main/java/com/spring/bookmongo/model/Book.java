package com.spring.bookmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    @Id
    private int id;
    private String title;
    private String author;
    private String coverPhotoURL;
    private Long isbnNumber;
    private Double price;
    private String Language;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCoverPhotoURL() {
        return coverPhotoURL;
    }
    public void setCoverPhotoURL(String coverPhotoURL) {
        this.coverPhotoURL = coverPhotoURL;
    }
    public Long getIsbnNumber() {
        return isbnNumber;
    }
    public void setIsbnNumber(Long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String language) {
        Language = language;
    }

}
