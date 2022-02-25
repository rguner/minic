package com.guner.file;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeFileReaderWithFiles {

    public static void main(String[] args) throws IOException {
        LargeFileReaderWithFiles l = new LargeFileReaderWithFiles();
        l.execute();
    }

    private void execute() {


        try {
            //InputStream in = this.getClass().getClassLoader().getResourceAsStream("file/read/StarWars3.wav");
            URL url = getClass().getResource("/file/read/StarWars3.wav");
            InputStream in = url.openStream();
            AudioInputStream stream = AudioSystem.getAudioInputStream(in);
            System.out.println(stream);
            System.out.println(this.getClass().getClassLoader().getResourceAsStream("file/read/StarWars3.wav"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}