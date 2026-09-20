import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Java Calculator ===");
        
        // Take the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Take the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Take the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        // Perform calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
                
            case '/':
                // Handle division by zero error
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
                
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }
        
        // Close the scanner resource
        scanner.close();
    }
}