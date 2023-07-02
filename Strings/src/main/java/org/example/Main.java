package org.example;
import java.util.Arrays;
public class Main {

    // add String:hier wird in jeder Schleife ein neuer String generiert -> sehr viel Arbeitsspeicher wird dabei benötigt
    public static void addStrings(int limit) {
        String result = "";
        for (int i =1; i < limit; i++) {
            result += "Java";
        }
        System.out.println(result);
    }

    // append String: Alternative mit StringBuilder um Arbeistspeicher zu sparen
    public static void appendString(int limit) {
        StringBuilder result = new StringBuilder();
        for (int i =1; i < limit; i++) {
            result.append("Java");
        }
        System.out.println(result);
    }


    
    // Übung: Wort Java -> avaJ
    public static String revert(String str) {
        String result = "";
        for (int i = str.length() - 1; i>= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }



    // Der Aufruf monthAsString("06.09.2098") sollte "September" als Ergebnis zurückgeben.
    public static String monthAsString(String str) {
        String month = "";
        month = str.substring(3,5);
        int monthInteger = Integer.parseInt(month);
        String monthNames [] = {"", "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        return monthNames[monthInteger];
    }



    //prüfen ob 2 Zeichenketten ein Anagramm bilden können
    public static boolean isAnagram (String str1, String str2) {
        // Leerzeichen entfernen und alles klein schreiben
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        // string in ein Array umwandeln für jeden einzelnen Buchstaben
        String [] str1split = str1.split("");
        String [] str2split = str2.split("");

        //Array sortieren
        Arrays.sort(str1split);
        Arrays.sort(str2split);

        // Array vergleichen
        return Arrays.equals(str1split, str2split);
    }



    // eine Methode Palindrom, die aus einem Text alle Palindrome auf der Konsole ausgibt
    //"Der vor dir stehende Rentner heißt Otto Uwe" -> Rentner, Otto
    public static void palindrom(String text) {
        // Text alles kleinschreiben
        text = text.toLowerCase();

        //Text in ein Array verwandeln pro Wort
        String [] textSplit = text.split(" ");

        //2. Array erstellen und jeden Eintrag rückwärts ausführen (siehe dazu Methode oben)
        String [] textReverse = new String[textSplit.length];
        for (int i = 0; i <= textSplit.length-1; i ++) {
            textReverse[i] = revert(textSplit[i]);
        }

        // Arrays miteinander vergleichen Eintrag für Eintrag
        for (int i = 0; i <= textSplit.length-1; i ++) {
            if (textSplit[i].equals(textReverse[i])) {
                System.out.println(textSplit[i]);
            }
        }

    }




    public static void main(String[] args) {
        addStrings(100);
        appendString(100);
        System.out.println("Java lautet rückwärts " + revert("Java"));
        System.out.println("Java lautet rückwärts " + revert("Java").toLowerCase());
        System.out.println("Der Monat im Datum 06.12.2098 lautet: " + monthAsString("06.12.2098"));
        System.out.println("Sind die Wörter A Rope Ends It und Desperation ein Anagram? " + isAnagram("A Rope Ends It", "Desperation"));
        System.out.println("Palindrome von \"Der vor dir stehende Rentner heißt Otto Uwe\" sind folgende Wörter:");
        palindrom("Der vor dir stehende Rentner heißt Otto Uwe");

    }
}