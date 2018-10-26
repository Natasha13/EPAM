package com.minarchenko.taskTwo.partOne.data;

import com.minarchenko.taskTwo.partOne.model.entity.Book;

public class DataSource {
    public static Book[] getBooks(){
        return new Book[]{
                new Book("Title","Shevchenko","FGH",2010,320,450),
                new Book("Title2","Shevchenko","BXV",2000,120,250),
                new Book("Title3","Franko","FLP",2010,320,150),
                new Book("Title4","Popudrenko","BXV",2007,170,50),
                new Book("Title5","Kocubinskiy","CCCP",2011,520,1050),
                new Book("Title6","Gogol","DOVZENKO",2010,100,2000),
                new Book("Title7","Pushkin","USA",2008,620,4900),
                new Book("Title8","Drozd","KRAINA",2005,380,20),
                new Book("Title9","Dovdzenko","MRIYA",2015,150,150),
                new Book("Title10","Kostenko","BXV",1999,400,290)
        };
    }
}
