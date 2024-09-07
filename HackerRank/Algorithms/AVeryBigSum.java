/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 20:45:02            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();  // array size

        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextLong();
        }
        
        arraySum(arr, n);

        input.close();
    }

    //method to sum of the elements in the array
    public static void arraySum(long[] a, int n){
        long sum = 0;

        for(int i=0; i<n; i++){
            sum += a[i];
        }
        
        System.out.println(sum);
    }
}
