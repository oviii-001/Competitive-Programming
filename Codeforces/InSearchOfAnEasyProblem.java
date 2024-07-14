                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 30-05-2024 | 02:34:36            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // the number of people who were asked to give their opinions

        int sum = 0;

        for(int i=0; i<n; i++){
            int x = input.nextInt();  // answers of n people
            sum += x;
        }

        if(sum >= 1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
        
        input.close();
    }
}
