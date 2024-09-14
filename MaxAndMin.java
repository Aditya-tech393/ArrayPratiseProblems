import java.util.Scanner;

public class MaxAndMin {
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

        // Initialize max and min to the first element of the array
        int max = myArray[0];
        int min = myArray[0];

        // Find maximum and minimum values in the array
        for (int i = 1; i < size; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        // Display the maximum and minimum values
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
