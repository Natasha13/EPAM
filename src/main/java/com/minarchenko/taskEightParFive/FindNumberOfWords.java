package com.minarchenko.taskEightParFive;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class FindNumberOfWords extends RecursiveAction
{
    private File filenameDirectory;
    private String prefix = "a";

    public FindNumberOfWords(File filenameDirectory) {
        this.filenameDirectory = filenameDirectory;
    }

    @Override
    protected void compute() {
        long numberOfWords = 0L;
        try (BufferedReader br = new BufferedReader(new FileReader(filenameDirectory))) {
            numberOfWords = br.lines()
                    .map(s -> s.split(" "))
                    .flatMap(Arrays::stream)
                    .filter(s -> s.toLowerCase().startsWith(prefix))
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filenameDirectory + " count: " + numberOfWords);
    }
}




