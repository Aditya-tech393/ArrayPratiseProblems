import java.util.Scanner;
public class SumAverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] myArray = new int[size];

        // Input: Prompt the user to enter values for the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += myArray[i];
        }

        // Calculate the average
        double average = (double) sum / size;

        // Display the results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}

