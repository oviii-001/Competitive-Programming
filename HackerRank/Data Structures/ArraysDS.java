/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 13:19:06            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Arrays;
import java.util.Scanner;

public class ArraysDS{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        //original arrays
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        //reversed structure
        int[] revArr = new int[n];
        for(int i=n-1; i>=0; i--){
            revArr[n-1-i] = arr[i];  //reversed arrays  //revArr[n-1-i] = arr[i]; ashol khela to ekhane
        }
        System.out.println(Arrays.toString(revArr).replaceAll("\\[|\\]|,", ""));

        input.close();
    }
}