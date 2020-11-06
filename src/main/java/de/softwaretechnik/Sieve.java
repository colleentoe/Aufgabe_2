package de.softwaretechnik;

public class Sieve {
    public int[] isPrime;

    public int[] getPrime(int maxPrimes){
        isPrime = new int[maxPrimes];
        int nextPrime = 2;
        int primeCount = 1;
        int check = 2;

        //zwei ist die erste Primzahl, wird also übersprungen
        int i = 1;
        isPrime[0] = 2;

        while(primeCount<maxPrimes) {
            //zahl ist KEINE Primzahl
            if (nextPrime % check == 0) {
                nextPrime++;
                check = 2;
            }
            //noch keinen Teiler gefunden
            else {
                check++;
            }
            //Zahl ist eine Primzahl
            if (check == nextPrime) {
                isPrime[i] = nextPrime;
                check = 2;
                nextPrime++;
                primeCount++;
                i++;
            }
        }
        return isPrime;
    }
}
