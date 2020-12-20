package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        File file = null;
        FileInputStream fileStream = new FileInputStream(file = new File ("lena.tif"));
        byte[] b = new byte[(int) file.length()];


        fileStream.read(b);
int counter = 0;


        for (int i = 0; i < b.length; i++) {
            System.out.println(
                    "b[" + i + "] = " +((int)b[i] < 11  ? "  " : "") +
                            b[i] + " , " +" character=(" + (char)b[i] + ")");
            counter ++;
        }


        System.out.println(counter);
        System.out.println(b.length);
    }
}
