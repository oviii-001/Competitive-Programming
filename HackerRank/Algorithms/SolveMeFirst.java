/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 14:40:20            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class SolveMeFirst{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        
        System.out.println(sum(a, b));

        in.close();;
    }

    public static int sum(int a, int b){
    
        return a + b;

    }
}