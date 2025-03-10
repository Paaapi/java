
 import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size= ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose);
        
        if (isSymmetric(matrix, transpose)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("not symmetric.");
        }
        
        System.out.println("Trace of the Matrix: " + calculateTrace(matrix));
        
        scanner.close();
    }
    
        static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] transpose = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    
    static boolean isSymmetric(int[][] matrix, int[][] transpose) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != transpose[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }
    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}