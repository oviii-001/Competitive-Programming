                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 10-05-2024 | 20:47:19            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class MyFirstSortingProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        for(int i=0; i<testCase; i++){
            int x = input.nextInt();
            int y = input.nextInt();

            if(x>y){
                System.out.println(y+" "+x);
            }
            else{
                System.out.println(x+" "+y);
            }
        }
        input.close();
    }
}