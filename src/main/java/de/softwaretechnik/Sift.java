package de.softwaretechnik;

public class Sift {

    private int getPrimeNumber;
    private Integer[] primeList;
    private int count=1;

    public Sift(int getPrimNumber) {
        this.getPrimeNumber = getPrimNumber;
        this.primeList = findPrimes(getPrimeNumber);
    }

    private Integer[] findPrimes(int getPrimeNumber){
        Integer[] newArray = new Integer[getPrimeNumber+1];

        for (int i = 0; i < getPrimeNumber+1; i++) {
            if(i==0) newArray[i] = -1;
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

    public Integer[] getPrimeList() {
        Integer[] smallList = new Integer[getPrimeNumber+1-count];
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
