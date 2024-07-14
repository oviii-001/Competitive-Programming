                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 29-06-2024 | 17:17:15            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  //test case

        for(int i=0; i<t; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if((a+b) == c){
                System.out.println("+");
            }
            else if((a-b) == c){
                System.out.println("-");
            }
        }
        input.close();
    }
}
