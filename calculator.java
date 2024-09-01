import java.util.Scanner;

public class calculator {

    private static void separator(){
        //this is for the separator
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Close the scanner to free up resources
        ) {
            separator();
            System.out.println("Simple Calculator");

            separator();
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            separator();
            System.out.print("Enter operation (+, -, *, /): ");
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
                    System.out.println("Error! Invalid operation."); //sends this message if not in the choices
                    return;
                }
            }

            separator();
            System.out.println("Result: ");
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result); //prints the result
        }
    }
}
