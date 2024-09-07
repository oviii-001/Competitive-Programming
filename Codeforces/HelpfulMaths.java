                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 09-05-2024 | 11:34:42            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine(); //the sum Xenia needs to count

        String[] numbers = s.split("\\+"); //removing "+" from this string by split
        
        Arrays.sort(numbers);
        String sortedString = String.join("+", numbers); //adding "+" among this numbers by String.join()

        System.out.println(sortedString);

        input.close();
    }
}
