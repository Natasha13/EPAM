package com.epam.controler;

import com.epam.model.entity.Book;
import com.epam.service.BookService;
import com.epam.view.BooksView;

import java.util.Scanner;

public class Controller {
    public Controller(BookService bookService) {
        this.bookService = bookService;
    }

    private BookService bookService;


    public void run() {
        Scanner scan = new Scanner(System.in);
        int b = 0;
        while (b == 0) {
            System.out.println();
            System.out.println("Choose : ");
            System.out.println("1) All books ");
            System.out.println("2) Books by author: ");
            System.out.println("3) Books by publisher: ");
            System.out.println("4) Books after year: ");
            System.out.println("5) Books publisher by alphabet: ");
            System.out.println("6) Exit ");


            int numMax = scan.nextInt();
            String numMax2;

            Book[] books = new Book[0];
            switch (numMax) {
                case 1:
                    System.out.println("Books: ");
                    books = this.bookService.getAllBooks();
                    break;
                case 2:
                    System.out.println("Enter author: ");
                    numMax2 = scan.next();
                    System.out.println("Books by author: ");
                    books = this.bookService.getByAuthor(numMax2);
                    break;
                case 3:
                    System.out.println("Enter publisher:");
                    numMax2 = scan.nextLine();
                    System.out.println("Books by publisher: ");
                    books = this.bookService.getByPublisher(numMax2);
                    break;
                case 4:
                    System.out.println("Enter year: ");
                    numMax = scan.nextInt();
                    System.out.println("books after year: ");
                    books = this.bookService.getAfterYear(numMax);
                    break;
                case 5:
                    System.out.println("Books published byalphabet: ");
                    books = this.bookService.getPublisherByAlphabet();
                    break;
                case 6:
                    b = 1;
                    break;
                default:
                    System.out.println("Choose existing variant ");
                    break;
            }

            for (Book aBook : books) {
                System.out.println(aBook);
            }
        }
        scan.close();
    }

}

