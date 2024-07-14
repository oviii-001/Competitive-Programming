                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 02-06-2024 | 21:58:06            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();  // Berlandish word
        
        String t = input.nextLine();  // Birlandish word

        String reversed_s = "";

        for(int i=s.length()-1; i>=0; i--){
            reversed_s += s.charAt(i);
        }

        if(t.equals(reversed_s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        input.close();
    }
}
