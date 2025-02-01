import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Initialize the sum variable
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 2; i <= n; i += 2) {
            sum += i;  // Add the even number to the sum
        }

        // Output the sum of all even numbers up to n
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}
