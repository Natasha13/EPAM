package com.epam.view;

import com.epam.model.entity.Book;

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
