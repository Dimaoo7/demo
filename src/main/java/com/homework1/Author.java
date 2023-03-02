package com.homework1;

public class Author {
    private final String author;

    public String getAuthor() {
        return this.author;
    }


    public Author (String author){
            this.author = author;
    }

    @Override
    public String toString() {
        return "\n Автор " + author;
    }

    @Override
    public int hashCode() {
        return author.hashCode();
    }

    public boolean equals(boolean eq) {
        if (author.equals(getAuthor())) {
            eq = true;
        }
        return eq;
    }
}