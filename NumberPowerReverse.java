public class NumberPowerReverse {
    public static void main(String[] args) {
        int num = 12;   // Original number

        // Step-by-step reverse logic
        int temp = num;       // Store original number
        int rev = 0;          // Will hold the reversed number
        
        while (temp > 0) {
            int digit = temp % 10;       // Step 1: Extract last digit
            rev = rev * 10 + digit;      // Step 2: Append digit to reverse
            temp = temp / 10;            // Step 3: Remove last digit
        }

        // Calculate power
        double result = Math.pow(num, rev);

        // Output
        System.out.println("Number: " + num);
        System.out.println("Reverse: " + rev);
        System.out.println(num + "^" + rev + " = " + result);
    }
}
