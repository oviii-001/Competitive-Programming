                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 31-05-2024 | 12:07:12            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // the number of orange-containing drinks in Vasya's fridge

        double sum = 0.0;

        for(int i=0; i<n; i++){
            int orange = input.nextInt();  // the volume fraction of orange juice in the i-th drink in percent

            sum += orange;
        }
        System.out.printf("%.12f", sum/n);  // the volume fraction in percent of orange juice in Vasya's cocktail

        input.close();
    }
}
