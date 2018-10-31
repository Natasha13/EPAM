package com.minarchenko.taskFive.partThree;

import java.util.Scanner;

class TranslationService {
    public static String translationResult() {
        Scanner scan = new Scanner(System.in);

        String inputString= scan.nextLine();
        scan.close();
        System.out.println("you write: " + inputString);

        String resultPhrase = "";
        for (String s : inputString.split(" ")) {
            if (DataSource.input().get(s) == null) {
                resultPhrase = resultPhrase + s + " ";
            } else {
                resultPhrase = resultPhrase + DataSource.input().get(s)+ " ";
            }
        }
        return resultPhrase;
    }
}
