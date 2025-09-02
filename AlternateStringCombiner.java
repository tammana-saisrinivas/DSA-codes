import java.util.Scanner;

public class AlternateStringCombiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        // Get the length of the shorter and longer string
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        // Combine characters alternately
        for (int i = 0; i < minLen; i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        // Append the remaining characters of the longer string
        if (len1 > len2) {
            result.append(str1.substring(minLen));
        } else if (len2 > len1) {
            result.append(str2.substring(minLen));
        }

        // Output
        System.out.println("Combined String: " + result.toString());
    }
}
