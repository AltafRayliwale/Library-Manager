package com.myPackage;

import java.util.Scanner;

public class LibrarySystem {
    private Library library;
    private Scanner scanner;

    public LibrarySystem() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();
        Book book = new Book(id, title, author);
        library.addBook(book);
    }

    public void borrowBook() {
        System.out.println("Enter Book ID to borrow: ");
        int id = scanner.nextInt();
        Book book = library.getBookById(id);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook() {
        System.out.println("Enter Book ID to return: ");
        int id = scanner.nextInt();
        Book book = library.getBookById(id);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void listBooks() {
        library.listBooks();
    }

    public void run() {
        while (true) {
            System.out.println("\nLibrary System:");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. List Books");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    listBooks();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
