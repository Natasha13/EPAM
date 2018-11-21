package com.minarchenko.taskEightParFive;

import java.io.File;
import java.util.concurrent.RecursiveAction;

public class FilePass extends RecursiveAction {
    private File motherFilePass;

    public FilePass(File motherFilePass) {
        this.motherFilePass = motherFilePass;
    }

    @Override
    protected void compute() {
        File[] directories = motherFilePass.listFiles();
        for (File directory : directories) {
            if (directory.isFile()) {
                if (directory.getName().endsWith(".txt")) {
                    FindNumberOfWords findNumberOfWords = new FindNumberOfWords(directory);
                    findNumberOfWords.fork();
                }
            } else {
                FilePass filePass = new FilePass(directory);
                filePass.fork();
            }
        }
    }
}

