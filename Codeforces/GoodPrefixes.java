                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 11-06-2024 | 21:40:37            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class GoodPrefixes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // test cases
        int[] results = new int[t];

        for(int i=0; i<t; i++){
            int n = input.nextInt();  // number of elements
            int[] array = new int[n];

            for(int j=0; j<n; j++){
                array[j] = input.nextInt();
            }
            results[i] = countGoodPrefixes(array);
        }
        for(int result : results){
            System.out.println(result);
        }
        input.close();
    }
    private static int countGoodPrefixes(int[] array){
        int count = 0;
        int runningSum = 0;

        for(int i=0; i<array.length; i++){
            runningSum += array[i];

            for(int j=0; j<=i; j++){
                if(runningSum-array[j] == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
