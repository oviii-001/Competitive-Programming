                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 16-05-2024 | 15:09:20            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String n = input.nextLine();
        int count = 0;

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7'){
                count++;
            }
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        input.close();
    }
}
