                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 15-06-2024 | 18:26:57            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class Pangram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // test case
        input.nextLine();
        String word = input.nextLine();
        boolean hasAllCharacters = true;

        for(char c = 'a'; c<='z'; c++){
            if(!word.toLowerCase().contains(String.valueOf(c))){
                hasAllCharacters = false;
                break;
            }
        }
        if(hasAllCharacters){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        input.close();
    }
}
