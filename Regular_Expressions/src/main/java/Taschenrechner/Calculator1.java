import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // While Schleide, solange das Programm nicht beendet werden soll
        while (true) {
            // Read
            System.out.print("Eingabe: ");
            input = scanner.nextLine();

            // beendet Taschenrechner fals Eingabe = :q
            if (input.equals(":q")) {
                System.out.println("Der Taschenrechner wird beendet.");
                break;
            }

            // Eval
            String operator1;
            String operator2;
            String operand1;
            String operand2;

            Pattern pattern = Pattern.compile("\\s*([-+])?\\s*(\\d+)\\s*([-+*/%])?\\s*(\\d+)?");
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                operator1 = matcher.group(1);
                operand1 = matcher.group(2);
                operator2 = matcher.group(3);
                operand2 = matcher.group(4);
            } else {
                System.out.println("Ungültige Eingabe");
                continue;
            }


            // Berechnung basierend auf dem Operator
            double result = 0.0;
            if (operator1 != null || "+".equals(operator1)){
                    if (operator2 != null) {
                        switch (operator2) {
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
                                break;
                        }
                        // Print
                        System.out.println("Ergebnis: " + result);
                    }
                    else System.out.println("Ergebnis: " + operator1 + operand1);
            }



            // Loop
            System.out.println();
        }

        // Programmende
        scanner.close();
    }
}
