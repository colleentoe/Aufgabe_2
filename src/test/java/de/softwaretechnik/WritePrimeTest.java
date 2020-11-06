package de.softwaretechnik;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

class WritePrimeTest {

    @BeforeAll
    static void fileExisted(){

        File file = new File("test.txt");

        if (file.exists()){
            file.delete();
        }
    }

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

    @AfterAll
    static void newFileExisted(){

        File file = new File("test.txt");
        assertEquals(true , file.exists());
    }
}