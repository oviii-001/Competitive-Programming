/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 27-08-2024 | 14:12:41            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class Staircase {
    public static void makingPyramid(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        makingPyramid(n);
    }
}
