package org.example;

public class Main {

    // add String:hier wird in jeder Schleife ein neuer String generiert -> serh viel Arbeitsspeicher wird dabei benötigt
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


    public static void main(String[] args) {
        addStrings(100);
        appendString(100);
        System.out.println("Java lautet rückwärts " + revert("Java"));
        System.out.println("Java lautet rückwärts " + revert("Java").toLowerCase());
        System.out.println("Der Monat im Datum 06.12.2098 lautet: " + monthAsString("06.12.2098"));

    }
}