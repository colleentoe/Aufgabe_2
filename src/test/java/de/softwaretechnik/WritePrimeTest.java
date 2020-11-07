package de.softwaretechnik;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @author1 Denice Graupeter M26783
 * @author2 Colleen Tölle M27430
 * @date 2020-11-02
 *
 * Softwaretechnik Exercise 2
 *
 * This class tests all the methods from WritePrime class.
 */
class WritePrimeTest {

    //Test deletes the test file if it exists.
    @BeforeAll
    static void fileExisted(){

        File file = new File("test.txt");

        if (file.exists()){
            file.delete();
        }
    }

    //Test to write in the text file.
    @Test
    void writeFile(){

        WritePrime write = new WritePrime();
        try{
           write.writeFile(new int[]{5, 4, 6, 8, 9, 2}, null);
        }
        catch (Exception e ){
            assertEquals(IOException.class , e.getClass());
        }
    }

    //Test if the write succeeded.
    @AfterAll
    static void newFileExisted(){

        File file = new File("test.txt");
        assertEquals(true , file.exists());

        try {
            List<String> content = Files.readAllLines(Paths.get(file.toURI()));

            String expected = "5 4 6 8 9 2 ";
            assertEquals(expected,content.get(0));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}