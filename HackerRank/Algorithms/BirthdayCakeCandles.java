


/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 30-08-2024 | 02:34:53            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(int[] a, int n){
        int high = 0;
        int highCount = 0;
        for(int i=0; i<n; i++){
            if(a[i]>high){
                high = a[i];
            }
        }
        for(int i=0; i<n; i++){
            if(a[i] == high){
                highCount++;
            }
        }
        return highCount;
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] candles = new int[n];
            for(int i=0; i<n; i++){
                candles[i] = in.nextInt();
            }
            birthdayCakeCandles(candles, n);
            System.out.println(birthdayCakeCandles(candles, n));
        }
    }
}
