package JavaPracticals;

import java.util.Scanner;

public class Prac11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt to divide numerator by denominator
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exceptions (e.g., division by zero)
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close any open resources (in this case, the scanner)
            scanner.close();
        }

        System.out.println("Program completed.");
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            // Throw an arithmetic exception if denominator is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}