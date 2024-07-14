                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 02-05-2024 | 20:56:55            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class Maximize {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int TestCase = input.nextInt();

        for(int i=0; i<TestCase; i++){
            int x = input.nextInt();
            int y = x - 1;
            while(gcd(x, y) != 1){
                y--;
            }
            System.out.println(y);
        }
        input.close();
    }
    private static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
