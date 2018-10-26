package com.minarchenko.taskTwo.partOne.service;

import com.minarchenko.taskTwo.partOne.data.DataSource;
import com.minarchenko.taskTwo.partOne.model.entity.Book;

import java.util.Arrays;

public class BookService {

    public Book[] getAllBooks() {
        return DataSource.getBooks();
    }

    public Book[] getByAuthor(String author) {
        Book[] books = getAllBooks();
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                temp[counter] = books[i];
                counter++;
            }
        }
        return Arrays.copyOf(temp, counter);
    }

    public Book[] getByPublisher(String publisher) {
        Book[] books = getAllBooks();
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                temp[counter] = book;
                counter++;
            }
        }
        return Arrays.copyOf(temp, counter);
    }

    public Book[] getAfterYear(int year) {
        Book[] books = getAllBooks();
        Book[] books1 = new Book[books.length];
        Book[] temp = new Book[books.length];
        int counter = 0;
        for (Book book : books) {
            if (book.getYear() > year) {
                temp[counter] = book;
                counter++;
            }
        }
        return Arrays.copyOf(temp, counter);
    }

    public Book[] getPublisherByAlphabet() {
        Book[] books = getAllBooks();

        for (int j = 0; j < books.length; j++)
        {
            for (int i = j + 1; i < books.length; i++)
            {
                if (books[i].getPublisher().compareTo(books[j].getPublisher()) < 0)
                {
                    Book t = books[j];
                    books[j]= books[i];
                    books[i] = t;
                }
            }
        }
        return books;
    }
}
