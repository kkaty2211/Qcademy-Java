package for_loops;

public class For_Loops_Bsp {
    public static int summeRekursion(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + summeRekursion(n-1);
        }
    }

    public static int summeForSchleife(int n){
        int result = 0;
        for (int index = 0; index <= n; index++) {
            result += index;
        }
        return result;
    }


    public static int FakultaetForSchleife(int n){
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result = result * index;
        }
        return result;
    }

    public static int FibonacciForSchleife(int n){
        int result = 0;
        int result1 = 1;
        int result2 = 1;
        if (n <= 0) {
            throw new IllegalArgumentException("Die Eingabe muss eine natürliche Zahl sein.");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int index = 3; index <= n; index++) {
                result = result1 + result2;
                result1 = result2;
                result2 = result;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int limit = 5;
        System.out.println("Die Summe von 0 bis " + limit + " berechnet mit der FOR-Schleife beträgt: " + summeForSchleife(limit));
        System.out.println("Die Summe von 0 bis " + limit + " berechnet mit der Rekursion beträgt: " + summeRekursion(limit));
        System.out.println("Die Fakultät von " + limit + " berechnet mit der FOR-Schleife beträgt: " + FakultaetForSchleife(limit));
        System.out.println("Die " + limit+". Zahl in der Fibonacci-Reihe berechnet mit der FOR-Schleife ist: " + FibonacciForSchleife(limit));
    }
}
