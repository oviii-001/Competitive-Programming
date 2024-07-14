                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 18-05-2024 | 14:09:23            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // asking for the size of the matrix
        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();

        // initializing the matrix with the given size
        double[][] matrix = new double[n][n];

        // asking for the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // asking for the position of the element for which the cofactor needs to be calculated
        System.out.print("Enter the row position of the element: ");
        int row = input.nextInt() - 1;
        System.out.print("Enter the column position of the element: ");
        int col = input.nextInt() - 1;

        // calculating the minor of the element
        double minor = getMinor(matrix, row, col);

        // calculating the cofactor of the element
        double cofactor = getCofactor(matrix, row, col);

        // displaying the results
        System.out.println("The minor of the element in position [" + (row + 1) + (col + 1) + "] is: " + minor);
        System.out.println("The cofactor of the element in position [" + (row + 1) + (col + 1) + "] is: " + cofactor);

        input.close();
    }

    // METHOD>>>to calculate the minor of the given element in the matrix
    private static double getMinor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] subMatrix = new double[n - 1][n - 1];

        // creating the submatrix by excluding the specified row and column
        int sub_i = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int sub_j = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                subMatrix[sub_i][sub_j] = matrix[i][j];
                sub_j++;
            }
            sub_i++;
        }

        // calculating and return the determinant of the submatrix
        return getDeterminant(subMatrix);
    }

    // METHOD>>>to calculate the cofactor of an element
    private static double getCofactor(double[][] matrix, int row, int col) {
        double minor = getMinor(matrix, row, col);
        return (row + col) % 2 == 0 ? minor : -minor;
    }

    // METHOD>>>to calculate the determinant of a matrix
    private static double getDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        double det = 0;
        for (int j1 = 0; j1 < n; j1++) {
            double[][] subMatrix = new double[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int j2 = 0;
                for (int j = 0; j < n; j++) {
                    if (j == j1) continue;
                    subMatrix[i - 1][j2] = matrix[i][j];
                    j2++;
                }
            }
            det += Math.pow(-1.0, 1.0 + j1 + 1.0) * matrix[0][j1] * getDeterminant(subMatrix);
        }
        return det;
    }
}
