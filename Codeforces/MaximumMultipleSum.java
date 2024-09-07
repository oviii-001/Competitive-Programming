                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 11-06-2024 | 21:31:18            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class MaximumMultipleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();  // test cases
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            results[i] = findOptimalX(n);
        }
        
        for (int result : results) {
            System.out.println(result);
        }
        
        input.close();
    }
    
    private static int findOptimalX(int n) {
        int optimalX = 2;
        int maxSum = 0;
        
        for (int x = 2; x <= n; x++) {
            int sum = sumOfMultiples(n, x);
            if (sum > maxSum) {
                maxSum = sum;
                optimalX = x;
            }
        }
        
        return optimalX;
    }
    
    private static int sumOfMultiples(int n, int x) {
        int sum = 0;
        for (int multiple = x; multiple <= n; multiple += x) {
            sum += multiple;
        }
        return sum;
    }
}
