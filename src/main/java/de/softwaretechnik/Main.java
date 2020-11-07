package de.softwaretechnik;

/**
 * @author1 Denice Graupeter M26783
 * @author2 Colleen Tölle M27430
 * @date 2020-11-02
 *
 * Softwaretechnik Exercise 2
 *
 * This Class creates a text file with the prime numbers. The maximum nuber is the transfered argument
 * number.
 */
public class Main {

    public static void main(String[] args){

        String dataName = "test";

        if (args.length > 1) dataName = args[1];

        int maxPrimes =  Integer.parseInt(args[0]);

        Sieve sieve = new Sieve(maxPrimes);

        int[] primes = sieve.getPrimeList();

        try{
            WritePrime writePrime = new WritePrime();
            writePrime.writeFile(primes, dataName);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}