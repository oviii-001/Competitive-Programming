                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 29-04-2024 | 13:55:01            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int TestCase = input.nextInt();

        for(int i=0; i<TestCase; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int total = a+b+c;
            int third_value;

            if(a==b){
                third_value = total - (a+b);
                System.out.println(third_value);
            }
            else if(b==c){
                third_value = total - (b+c);
                System.out.println(third_value);
            }
            else if(a==c){
                third_value = total - (a+c);
                System.out.println(third_value);
            }
        }

        input.close();
    }
}
