package com.homework1;

public class Main {

    public static void main(String[] args) {
        Author Rifudzin = new Author("Рифудзин на Магонотэ");
        Author Robert = new Author("Роберт Грин");

       Book Robe = new Book(Robert, "48 законов власти ", 1998);

       Book Rifud = new Book(Rifudzin, "Реинкорнация безработного ", 2012);

        System.out.println(Robe.toString());

        System.out.println(Rifud.toString());

        Robe.setPublishYear(2024);

        System.out.println("Год " + Robe.getPublishYear());

        if (Robe.hashCode() == Rifud.hashCode()) {
            System.out.println("Книги одинаковые по хеш коду");
        } else System.out.println("Книги разные по хеш коду");

        if (Robe.toString().equals(Rifud.toString())) {
            System.out.println("Книги одинаковые");
        } else System.out.println("Книги разные");

    }
}
