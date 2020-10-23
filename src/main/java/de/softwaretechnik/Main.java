package de.softwaretechnik;

public class Main {

    private String[] _args;
    public Main(String[] args) {
        this._args = args;
    }

    public void primz(){
        int number = Integer.parseInt(_args[0]);
        Integer[] list = new Sift(number).getPrimeList();
        for (int i = 0; i < list.length; i++) {
            System.out.printf(list[i] + " ");
        }
    }

    public void createFile(){

    }

    public static void main(String[] args) {
        Main m = new Main(args);
        m.primz();
    }
}
