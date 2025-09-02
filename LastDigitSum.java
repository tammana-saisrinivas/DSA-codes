import java.util.Scanner;

public class LastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Get last digits
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        // Calculate sum of last digits
        int sum = lastDigit1 + lastDigit2;

        // Display the result
        System.out.println("Sum of last digits: " + sum);
    }
}
