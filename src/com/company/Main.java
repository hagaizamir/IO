package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        // write your code here

        InputStream in = null;
        try {
            in = new FileInputStream("1.text");
            byte[] buffer = new byte[1024];
            int howMany = 0;
            while (howMany != -1) {
                howMany = in.read(buffer);
            }

        } catch (FileNotFoundException e) {
            //
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
