/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 27-08-2024 | 13:50:45            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        calculatingRatio(arr, n);

        input.close();
    }

    public static void calculatingRatio(int[] a, int n){
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i=0; i<n; i++){
            if(a[i]>0){
                pos++;
            }
            else if(a[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double)pos/n);
        System.out.printf("%.6f\n", (double)neg/n);
        System.out.printf("%.6f\n", (double)zero/n);
    }
}
