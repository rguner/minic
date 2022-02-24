package com.guner.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeFileReaderWithFiles {

    public static void main(String[] args) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String file = currentDirectory + "\\file\\read\\file.txt";
        Path path = Paths.get(file);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null){
            System.out.println(curLine);
        }
        bufferedReader.close();
    }
}