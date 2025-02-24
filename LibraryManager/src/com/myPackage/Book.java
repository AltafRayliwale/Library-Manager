package com.myPackage;
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }

    public String getBookInfo() {
        return id + " | " + title + " | " + author + " | " + (isAvailable ? "Available" : "Borrowed");
    }
}
