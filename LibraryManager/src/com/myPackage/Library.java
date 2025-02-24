package com.myPackage;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null; // Book not found
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
    }
}
