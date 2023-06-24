package whille_loops;

import java.util.Arrays;

public class while_loops_bsp {


    //gibt die Fakultät einer Zahl wieder
    public static long fakultaetWhile(int n) { // long da mit Fakultaet das Ergebnis sehr schnell sehr groß werden kann
        long result = 1;
        int a = 1;
        while (a <= n) {
            result *= a;
            a++;
        }
        return result;
    }

    public static long fakultaetFor(int n) {
        long result = 1;
        for (int a =1; a<= n; a++) {
            result *= a;
        }
        return result;
    }


    // gibt die Summer eines Arrays wieder
    public static double array_summe(double[] arr) {
        double result = 0;
        int i = 0;
        while (i < arr.length) {
            result += arr[i];
            i ++;
        }
        return result;
    }



    //gibt die Primzahlen bis n wieder
    public static void primeNumbers(int n) {;
        int i = 2;
        while (i<= n) {
            if (isPrime(i)) {
                System.out.println(i);;
            }
            i++;
        }
    }

    public static boolean isPrime(int n) {
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }




    public static void main(String[] args) {
        int n = 9;
        System.out.println(n + "! (While Schleife) = " + fakultaetWhile(n));
        System.out.println(n + "! (For Schleife) = " + fakultaetFor(n));
        double[] arr = {9,2,5};
        System.out.println( "Die Summe des Arryas " + Arrays.toString(arr) + " lautet: "+ array_summe(arr));
        int b = 47;
        System.out.println("Die Primzahlen bis " + b + " sind folgende: ");
        primeNumbers(b);

    }
}
