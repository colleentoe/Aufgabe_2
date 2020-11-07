package de.softwaretechnik;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author1 Denice Graupeter M26783
 * @author2 Colleen Tölle M27430
 * @date 2020-11-02
 *
 * Softwaretechnik Exercise 2
 *
 * This class makes a new file and writes the prime numbers in the file.
 */
public class WritePrime {

    /**
     * This method makes a file with the transfered file name and writes the prime numbers in.
     * @param isPrime
     * @param name file name
     * @throws IOException
     */
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
