package com.minarchenko.taskFive.partOne.controller;

import com.minarchenko.taskFive.partOne.entity.JournalEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private List<JournalEntry> journalEntry;

    public Controller() {
        this.journalEntry=new ArrayList<>();
    }

    public void run() {
        String lastName="";
        String firstName="";
        String dateOfBirth="";
        String phoneNumber="";
        String adress="";
        Scanner scan = new Scanner(System.in);
        int b = 0;
        List<JournalEntry>journalEntries=new ArrayList<>();

        while (b == 0) {
            System.out.println();
            System.out.println("Enter Last name ");
            lastName = scan.nextLine();

            System.out.println("Enter First name ");
            firstName = scan.nextLine();

            System.out.println("Enter date of birth ");
            dateOfBirth= scan.nextLine();

            System.out.println("Enter telephone number (+38...)");
            phoneNumber= scan.nextLine();

            System.out.println("Enter adress (City, Street,number of house, flat)");
            adress = scan.nextLine();

            if (lastName.matches("[A-Z][a-z]+")) {
                if (firstName.matches("[A-Z][a-z]+")){
                  if (firstName.matches("[A-Z][a-z]+")){
                             if (dateOfBirth.matches("[0-3][0-9]\\.[0-1][0-9]\\.(19|20)[0-9]{2}")) {
                                 if (phoneNumber.matches("\\+[0-9]{12}")) {
                                     if (adress.matches("[A-Z][a-z]+,[A-Z][a-z]+,[0-9]+,[0-9]+")) {
                                         journalEntries.add(new JournalEntry(lastName, firstName, dateOfBirth, phoneNumber, adress));
                                     }
                            }
                         }
                    }
                }
            }
            System.out.println("Do you want to exit?  (Y/N) ");
           String exit = scan.nextLine();
           if (exit.equals("Y")){
               b=1;
               scan.close();
           }
        }

        for (JournalEntry entry : journalEntries) {
            System.out.println(entry);
        }
    }
}
