package com.homework1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(author, author1.author);
    }
}
