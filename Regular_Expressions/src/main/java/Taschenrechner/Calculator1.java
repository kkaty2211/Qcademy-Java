import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Variante von ChatGPT -> funktioniert nicht

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            // Read
            System.out.print("Eingabe: ");
            input = scanner.nextLine();

            // Überprüfen, ob das Programm beendet werden soll
            if (input.equals(":q")) {
                break;
            }

            // Eval
            String operator;
            String operand1;
            String operand2;

            Pattern pattern = Pattern.compile("([-+*/%])\\s*(\\d+)\\s*([-+*/%])?\\s*(\\d+)?");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                operator = matcher.group(1);
                operand1 = matcher.group(2);
                operand2 = matcher.group(4);
            } else {
                System.out.println("Ungültige Eingabe");
                continue;
            }

            // Berechnung basierend auf dem Operator
            double result;
            switch (operator) {
                case "+":
                    result = Double.parseDouble(operand1) + Double.parseDouble(operand2);
                    break;
                case "-":
                    result = Double.parseDouble(operand1) - Double.parseDouble(operand2);
                    break;
                case "*":
                    result = Double.parseDouble(operand1) * Double.parseDouble(operand2);
                    break;
                case "/":
                    result = Double.parseDouble(operand1) / Double.parseDouble(operand2);
                    break;
                case "%":
                    result = Double.parseDouble(operand1) % Double.parseDouble(operand2);
                    break;
                default:
                    System.out.println("Ungültiger Operator");
                    continue;
            }

            // Print
            System.out.println("Ergebnis: " + result);

            // Loop
            System.out.println();
        }

        // Programmende
        scanner.close();
    }
}
