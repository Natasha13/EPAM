package com.minarchenko.taskTwo.partOne;

import com.minarchenko.taskTwo.partOne.controler.Controller;
import com.minarchenko.taskTwo.partOne.service.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Controller controller=new Controller(bookService);
        controller.run();
    }
}
