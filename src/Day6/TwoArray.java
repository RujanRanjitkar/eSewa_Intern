package Day6;
import  java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the size of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Create the 2D array
        int[][] myArray = new int[rows][cols];

        // Prompt the user to input the values of the array
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value for position (" + i + ", " + j + "): ");
                myArray[i][j] = input.nextInt();
            }
        }

        // Print the values of the array
        System.out.println("The values of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
