/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 28-08-2024 | 02:45:54            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class MiniMaxSum {
    public static void calculatingMiniMaxSum(int[] a){

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        for(int i=0; i<5; i++){
            long sum = 0;
            for(int j=0; j<5; j++){
                if(i != j){
                    sum += a[j];
                }
            }
            min = Math.min(min, sum);
            max = Math.max(max, sum);

        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = new int[5];
            for(int i=0; i<5; i++){
                arr[i] = in.nextInt();
            }
            calculatingMiniMaxSum(arr);
        }
    }
}
