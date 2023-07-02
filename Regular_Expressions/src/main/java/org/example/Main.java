package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Alle Operationen mit Minus als Operator: 97-23;;;    89-34+98       -7";

        // Es wird ein Muster (Pattern) erstellt, um nach Zahlen zu suchen, die durch den Minusoperator getrennt sind.
        // 2x Backslash wird benötigt da 1x Backlash als String erkannt werden würde
        // das + benötige ich um weitere Suchmuster einzufügen
        // das * bedeuted optional (also Leerzeichen nicht zwingend erforderlich)
        // Beispiel: "90 - 5" -> würde Kriterien erfüllen
        Pattern pattern = Pattern.compile("\\d+\\s*-\\s*\\d+");

        //Ein Matcher wird erstellt, der das Muster auf den Text anwendet.
        Matcher matcher = pattern.matcher(str);

        // Eine Schleife wird verwendet, um alle Übereinstimmungen (matcher.find()) zu durchlaufen.
        while (matcher.find()) {

            // matcher.toMatchResult().group() aufgerufen, um die aktuelle Übereinstimmung abzurufen und auszugeben.
            System.out.println(matcher.toMatchResult().group());
        }

    }
}