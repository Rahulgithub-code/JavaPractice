package com.practice;

import java.util.Arrays;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        this.no_of_books++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are :");
        int count=1;
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println(count++ + " " +book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if(this.books[i]==book){
                System.out.println("'"+book+"'" + " book has been issued.");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("Book is not available.");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class LibraryTask {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java");
        library.addBook("C++");
        library.addBook("Algorithm");
        library.addBook("Angular");
        library.addBook("Spring Boot");
        library.issueBook("Java");
        library.returnBook("Java");
        library.showAvailableBooks();
        library.issueBook("C++");
        library.showAvailableBooks();

    }
}
