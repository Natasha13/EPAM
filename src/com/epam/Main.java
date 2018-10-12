package com.epam;

import com.epam.controler.Controller;
import com.epam.service.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Controller controller=new Controller(bookService);
        controller.run();
    }
}
