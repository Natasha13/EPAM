package com.minarchenko.taskTwo.partOne.view;

import com.minarchenko.taskTwo.partOne.model.entity.Book;

public class BooksView {
    private Book[] books;

    public BooksView(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String booksString = "";
        for (Book book : books) {
            booksString = booksString + book + "\n";
        }
        return booksString;
    }
}
