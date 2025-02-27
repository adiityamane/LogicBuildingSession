public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;  // Number of terms in the Fibonacci series
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci series up to the 10th number: ");

        // Printing the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;  // Next number is the sum of the previous two
            num1 = num2;  // Update num1 to num2
            num2 = nextNum;  // Update num2 to the next number
        }
    }
}
