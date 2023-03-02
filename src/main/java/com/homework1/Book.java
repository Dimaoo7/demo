package com.homework1;

public class Book {
    private final String nameOfBook;
    private final Author author;
    private int publishYear;

    public Book(Author author, String nameOfBook, int year ) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishYear = year;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

}

