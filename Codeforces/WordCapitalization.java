                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 28-04-2024 | 14:11:27            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;
import java.lang.String;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String wordWithoutFirstLetter = word.substring(1);

        System.out.println(Character.toUpperCase(word.charAt(0)) + wordWithoutFirstLetter);

        input.close();
    }
}
