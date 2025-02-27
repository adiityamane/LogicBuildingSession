import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

       
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        
        num1 = num1 + num2; // num1 becomes the sum of num1 and num2
        num2 = num1 - num2; // num2 becomes the original value of num1
        num1 = num1 - num2; // num1 becomes the original value of num2

       
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}
