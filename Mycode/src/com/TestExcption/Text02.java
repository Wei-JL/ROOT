package com.TestExcption;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text02 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("d:/test.txt");
            char c = (char) reader.read();
            char c2 = (char) reader.read();
            System.out.println(""+c + c2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader!=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
