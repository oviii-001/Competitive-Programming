                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 23-06-2024 | 20:58:31            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class XAxis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i=0; i<t; i++){
            int x1 = input.nextInt();
            int x2 = input.nextInt();
            int x3 = input.nextInt();

            int minDistance = Integer.MAX_VALUE;
            for(int a=1; a<=10; a++){
                int distance = Math.abs(a - x1) + Math.abs(a - x2) + Math.abs(a - x3);
                minDistance = Math.min(minDistance, distance);
            }
            System.out.println(minDistance);
        }
        input.close();
    }
}