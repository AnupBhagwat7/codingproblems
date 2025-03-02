package com.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    static FileReader reader;

    public static void main(String[] args) throws IOException {

        try {
            reader = new FileReader("D:\\Data\\myjavablog\\Books\\Microservices\\Demo\\codingproblems\\src\\main\\java\\com\\exceptions\\aa.txt");
            int ch = 1;
            // ch = reader.read();
            while (ch > 0){
                ch = reader.read();
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(reader != null){
                reader.close();
            }
        }
    }
}
