package com.company;

import java.io.*;

/**
 * Created by Hagai Zamir on 12-May-17.
 */
public class StreamIO {

    public static void write(String fileName, String data) {
        //1)fileWriter

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            //2) call the write method
            writer.write(data);
            writer.newLine();

            System.lineSeparator();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String read(String fileName) {
        StringBuilder data = new StringBuilder(); //TODO/; String Builder

        //data = content read the file
        // init the file reader


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append(System.lineSeparator());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }
}
