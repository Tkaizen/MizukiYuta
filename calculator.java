import java.util.Scanner;

public class addingcalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Close the scanner to free up resources
        ) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Enter operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        return;
                    }
                }
                default -> {
                    System.out.println("Error! Invalid operation.");
                    return;
                }
            }

            System.out.println("The result is: " + result);
        }
    }
}
