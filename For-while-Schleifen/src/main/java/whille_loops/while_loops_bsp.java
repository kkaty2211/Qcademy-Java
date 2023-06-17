package whille_loops;

public class while_loops_bsp {

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
    public static void main(String[] args) {
        int n = 9;
        System.out.println(n + "! (While Schleifr) = " + fakultaetWhile(n));
        System.out.println(n + "! (For Schleife) = " + fakultaetFor(n));

    }
}
