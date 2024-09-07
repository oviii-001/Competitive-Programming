                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 12-05-2024 | 13:01:59            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;
import java.util.HashSet;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<word.length(); i++){
            set.add(word.charAt(i));
        }

        int DistinctNumber = set.size();

        if(DistinctNumber % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

        input.close();
    }
}
