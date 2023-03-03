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


    @Override  public String toString() {
        return "Книга " + getNameOfBook()+ author.toString() + "\n Год издания " + getPublishYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameOfBook.equals(book.nameOfBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author);
    }
}

