                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 10-05-2024 | 01:17:51            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        for(int i=0; i<testCase; i++){
            int a = input.nextInt();
            int b = input.nextInt();

            int count = 0;

            if(a%b != 0){
                count = b - (a%b);
            }
            System.out.println(count);
        }
        input.close();
    }
}
