package com.javarush.task14.task1409;

import java.io.FileNotFoundException;
import java.io.SyncFailedException;
import java.nio.file.FileSystemException;

/*
Оборачивание исключений
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileNotFoundException | FileSystemException e) {
            throw new RuntimeException();
        }
    }
}