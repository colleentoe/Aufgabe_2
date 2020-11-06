package de.softwaretechnik;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveTest {

    @Test
    void findPrimes() {

        int[] expected = {-1 , 1 , 2 , 3 ,-1 , 5 , -1 , 7 };

        Sieve sieve = new Sieve(7);

        int[] get = sieve.findPrimes(7);

        for (int i = 0; i < expected.length ; i++) {
            assertEquals(expected[i] , get[i] );
        }
    }

    @Test
    void findPrimesFalse(){

        Sieve sieve = new Sieve(7);

        try{
            sieve.findPrimes(-7);
        }
        catch (NegativeArraySizeException e ){
            assertEquals(NegativeArraySizeException.class ,  e.getClass());
        }
    }

    @Test
    void getPrimeList() {

        int[] expected = {1 , 2 , 3 , 5 , 7 };

        Sieve sieve = new Sieve(7);

        int[] get = sieve.getPrimeList();

        for (int i = 0; i < expected.length ; i++) {
            assertEquals(expected[i] , get[i] );
        }
    }
}