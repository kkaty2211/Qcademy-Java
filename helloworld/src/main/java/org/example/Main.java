package org.example;

public class Main {
    public static int summe(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + summe(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Die Summe von 0 bis 5 ergibt: " + summe(5) );

    }
}
