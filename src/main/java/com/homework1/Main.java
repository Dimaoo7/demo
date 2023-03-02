package com.homework1;

public class Main {

    public static void main(String[] args) {
        Author Rifudzin = new Author("Рифудзин на Магонотэ");
        Author Robert = new Author("Роберт Грин");

       Book Robe = new Book(Robert, "48 законов власти ", 1998);

        Book Rifud = new Book(Rifudzin, "Moshoku Tensei", 2012);

        System.out.println("Книга " + Robe.getNameOfBook());

        System.out.println("Автор " + Robe.getAuthor().getAuthor());

        System.out.println("Год " + Robe.getPublishYear());

        Robe.setPublishYear(2024);
        System.out.println("Год " + Robe.getPublishYear());

    }
}
