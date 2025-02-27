public class LargestOfThree {
    public static void main(String[] args) {
        int a = 2, b = 6, c = 9; 

        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}
