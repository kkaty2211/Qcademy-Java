package org.example;


//Summe einer Zahl mit rekursiver Metode
/*
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
*/

// Fakultät einer Zahl mit rekursiver Methode
/*
public class Main {
    public static int fakultaet(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakultaet(n-1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Die Fakultät von 4 ist: " + fakultaet(4) );

    }
}
*/

// Fibonacci Zahlen mit rekursiver Methode

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    public static void main(String[] args) {
        System.out.println("Die 6. Zahl in der Fibonacci Reihe ist: " + fibonacci(5) );

    }
}