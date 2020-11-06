package de.softwaretechnik;

public class Main {

    public static void main(String[] args) {

        String dataName = "test";

        if (args.length>1) dataName = args[1];

        int maxPrimes =  Integer.parseInt(args[0]);

        Sieve sieve = new Sieve(maxPrimes);

        Integer[] primes = sieve.getPrimeList();

        WritePrime writePrime = new WritePrime();

        writePrime.writeFile(primes, dataName);
    }
}