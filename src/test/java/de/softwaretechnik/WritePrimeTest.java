package de.softwaretechnik;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

class WritePrimeTest {


    @BeforeAll
    void fileExisted(){

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
            System.err.println(e.getMessage());
        }
    }
}