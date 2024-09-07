                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 12-05-2024 | 11:58:52            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();
        String word2 = input.nextLine();

        int result = word1.compareToIgnoreCase(word2);

        if(result < 0){
            System.out.println("-1");
        }
        else if(result > 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        input.close();
    }
}
