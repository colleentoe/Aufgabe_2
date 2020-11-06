package de.softwaretechnik;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritePrime {

    public void writeFile(int[] isPrime, String name) throws IOException {

        if(name == null) name = "test";

        File file = new File(name + ".txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (int i = 0; i < isPrime.length; i++) {
                writer.write(isPrime[i] + " ");
            }
            writer.close();

    }
}
