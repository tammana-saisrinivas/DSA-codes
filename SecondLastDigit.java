import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        if (number < 10) {
            System.out.println("There is no second last digit.");
        } else {
            int secondLastDigit = (number / 10) % 10;
            System.out.println("Second last digit: " + secondLastDigit);
        }
    }
}
