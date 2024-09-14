import java.util.Scanner;
import java.util.Arrays;

public class DisplayArray {
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
            System.out.print("Element " + (i+1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.println("The array elements are: " + Arrays.toString(myArray));
    }
}
