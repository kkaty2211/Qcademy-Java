package org.example;

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