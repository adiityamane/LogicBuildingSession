import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

       
        long factorial = 1;

        
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Multiply factorial by i at each step
        }

        
        System.out.println("Factorial of " + num + " is " + factorial);

        scanner.close();
    }
}
