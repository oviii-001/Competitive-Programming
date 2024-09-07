/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 15:01:36            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  //size of the array
        int[] arr = new int[n];  //array declare
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();  //array element input
        }

        System.out.println(arraySum(arr, n));

        input.close();
    }

    //method of Array Sum
    public static int arraySum(int[] arr, int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        return sum;
    }
}
