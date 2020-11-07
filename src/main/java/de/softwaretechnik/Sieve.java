package de.softwaretechnik;

/**
 * @author1 Denice Graupeter M26783
 * @author2 Colleen Tölle M27430
 * @date 2020-11-02
 *
 * Softwaretechnik Exercise 2
 *
 * This class finds the prime numbers from 1 to the transfered maximum number.
 */
public class Sieve {

        private int primeMax;
        private int[] primeList;
        private int count = 1;


        public Sieve(int getPrimNumber) {
            this.primeMax = getPrimNumber;
            this.primeList = findPrimes(primeMax);
        }

    /**
     * Creates a array with the transfered numbers plus 1. Overwrites the numbers that are not prime
     * numbers with -1.
     * @param getPrimeNumber
     * @return a new Array
     */
    public int[] findPrimes(int getPrimeNumber){
            int[] newArray = new int[getPrimeNumber+1];

            for (int i = 0; i < getPrimeNumber+1; i++) {
                if(i == 0) newArray[i] = -1;
                else newArray[i] = i;
            }

            for (int i = 2; i < getPrimeNumber+1; i++) {
                if(newArray[i] == i){
                    int j = i;
                    do {
                        j += i;
                        if(j<=getPrimeNumber && newArray[j]!=-1){
                            newArray[j] = -1;
                            count++;
                        }
                    }while (j<=getPrimeNumber);
                }
            }
            return newArray;
        }

    /**
     * This method makes a new array with the prime numbers only.
     * @return
     */
    public int[] getPrimeList() {
            int[] smallList = new int[primeMax + 1 -count];
            int count = 0;
            for (int i = 0; i < primeList.length; i++) {
                if(primeList[i]!=-1) {
                    smallList[count] = primeList[i];
                    count++;
                }
            }
            return smallList;
        }
}