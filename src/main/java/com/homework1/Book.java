package com.homework1;

import java.util.Objects;

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


    public String toString() {
        return "Книга " + getNameOfBook()+ author.toString1() + "\n Год издания " + getPublishYear();
    }

    public int hashCode() {
        return java.util.Objects.hash(getNameOfBook());
    }



}

