import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        // Counting the number of digits
        int count = 0;
        while (num != 0) {
            num /= 10;  // Remove the last digit
            count++;    // Increment count
        }

        // Displaying the result
        System.out.println("The number has " + count + " digits.");

        scanner.close();
    }
}
