                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 16-05-2024 | 15:43:24            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // number of stones on the table
        input.nextLine();
        String s = input.nextLine().toUpperCase();  // colors of the stones

        int count = 0;

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);

        input.close();
    }
}
