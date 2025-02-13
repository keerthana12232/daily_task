import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int cols = sc.nextInt();

        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = new int[cols][rows]; // Transpose matrix will have reversed dimensions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

       
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);

        sc.close();
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
