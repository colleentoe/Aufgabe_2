package de.softwaretechnik;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritePrime {

    public void writeFile(Integer[] isPrime, String name) {
        if(name == null) name = "test";

        File file = new File(name + ".txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < isPrime.length; i++) {
                writer.write(isPrime[i] + " ");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
