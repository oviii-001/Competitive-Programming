                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 31-05-2024 | 00:57:13            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class Hulk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // the number of layers of love and hate

        String hate = "I hate ";
        String love = "I love ";
        String that = "that ";

        String start = "";

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                start += hate + that;
            }
            else{
                start += love + that;
            }
        }
        if(n==1){
            String newString = start.replaceAll(" that $", " ");  // removing last "that" from this string
            System.out.println(newString + "it");
        }
        else{
            String newString2 = start.replaceAll(" that $", " ");  // removing last "that" from this string
            System.out.println(newString2 + "it");
        }
        input.close();
    }
}
