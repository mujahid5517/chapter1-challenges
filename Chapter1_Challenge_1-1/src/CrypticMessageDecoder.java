
// Chapter1_Challenge_1_1.java
import java.util.Scanner;

public class CrypticMessageDecoder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Find number of digits
        int digits = (int) Math.log10(number) + 1;

        // Extract first and last digit
        int firstDigit = (int) (number / Math.pow(10, digits - 1));
        int lastDigit = number % 10;

        // Extract second and second-last digit
        int secondDigit = (int) (number / Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (number / 10) % 10;

        // Compute product and sum
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;

        // Final code
        String code = product + "" + sum;

        System.out.println("The decrypted code is: " + code);
        input.close();
    }
}
