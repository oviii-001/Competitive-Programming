                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 28-04-2024 | 22:00:28            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();  // the number from which Tanya will subtract
        int k = input.nextInt();  // the number of subtractions correspondingly

       for(int i=0; i<k; i++){
        if(n>0 && n%10 == 0){
            n = n/10;
        }
        else{
            n = n-1;
        }
       }
       System.out.println(n);

       input.close();
    }
}
