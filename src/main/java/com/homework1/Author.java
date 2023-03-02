package com.homework1;

public class Author {
    private final String author;

    public String getAuthor() {
        return this.author;
    }

    public Author (String author){
            this.author = author;
    }
    public String toString1() {
        return "\n Автор " + author;
    }

}
