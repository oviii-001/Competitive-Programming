/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 21:33:17            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();  //size of array

        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        diagonalSum(arr, n);

        input.close();
    }

    //method of diagonal sums and sum difference of the array
    public static void diagonalSum(int[][] a, int n){
        int priDiagSum = 0;
        int secDiagSum = 0;

        for(int i=0; i<n; i++){
                priDiagSum += a[i][i];
                secDiagSum += a[i][n-i-1];
        }
        int diff = Math.abs(priDiagSum - secDiagSum);
        System.out.println(diff);

    }
}
