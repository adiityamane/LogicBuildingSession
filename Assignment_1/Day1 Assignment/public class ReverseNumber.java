import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        // Variable to store the reversed number
        int reversed = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Add the digit to the reversed number
            num /= 10;  // Remove the last digit from the original number
        }

        
        System.out.println("The reverse of the number is " + reversed);

        scanner.close();
    }
}
