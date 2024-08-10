                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 07-08-2024 | 19:13:57            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/
import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  //test case
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            int lastDigit = n % 10;
            int firstDigit = (n - lastDigit) / 10;
            System.out.println((firstDigit+lastDigit));
        }
        input.close();
    }
}
