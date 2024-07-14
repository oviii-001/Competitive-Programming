                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 11-06-2024 | 20:36:02            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // test case
        for(int i=0; i<t; i++){
            String a = input.next();
            String b = input.next();

            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);
            
            System.out.println(newA + " " + newB);
        }
        input.close();
    }
}
