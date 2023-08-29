import java.util.Scanner;

public class Find5Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int rowIndex = -1;
        int columnIndex = -1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == target) {
                    rowIndex = i;
                    columnIndex = j;
                    break; // If found, exit the loop
                }
            }
            if (rowIndex != -1) {
                // If found, exit the outer loop as well
                break;
            }
        }

        if (rowIndex != -1 && columnIndex != -1) {
            System.out.println("Value " + target + " found at index (" + rowIndex + ", " + columnIndex + ")");
        } else {
            System.out.println("Value " + target + " not found in the matrix.");
        }

        scanner.close();
    }
}
