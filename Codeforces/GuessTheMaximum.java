                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 06-06-2024 | 21:19:20            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class GuessTheMaximum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // test case

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();  // the numbers of elements in the array

            // inputing the elements of the array
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = input.nextInt();
            }

            int maxK = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    maxK = Math.max(maxK, Math.abs(a[j] - a[k]));
                }
            }

            System.out.println(maxK);  // the maximum integer k at which Alice is guaranteed to win
        }

        input.close();
    }
}
