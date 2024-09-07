                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 30-05-2024 | 01:51:19            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // the number of rooms

        int r = 0;

        for(int i=0; i<n; i++){
            int p = input.nextInt();  // the number of people who already live in the i-th room
            int q = input.nextInt();  // the room's capacity

            if((q-p)>=2){
                r++;
            }
        }
        System.out.println(r);  // the number of rooms where George and Alex can move in

        input.close();
    }
}
