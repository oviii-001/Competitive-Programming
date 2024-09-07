                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 07-06-2024 | 11:54:17            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class CalculationFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long n = input.nextLong();  // the positive integer

        if(n%2 == 0){
            System.out.println(n/2);
        }
        else{
            long result = - ((n/2)+1);
            System.out.println(result);
        }
        input.close();
    }
}
