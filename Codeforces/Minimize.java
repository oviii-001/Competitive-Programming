
/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 03-09-2024 | 20:41:00            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class Minimize {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i=0; i<n; i++){
            int a = input.nextInt();
            int b = input.nextInt();

            int c = (a+b)/2;
            int d = (c-a)+(b-c);
            System.out.println(d);
        }
    }
}
