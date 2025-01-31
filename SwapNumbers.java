import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Display the numbers before swapping
        System.out.println("Before swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        // Swap the numbers without using a third variable
        a = a + b;  // a becomes the sum of a and b
        b = a - b;  // b becomes the original value of a
        a = a - b;  // a becomes the original value of b

        // Display the numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
