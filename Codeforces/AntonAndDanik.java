                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 21-05-2024 | 12:34:16            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  // the number of games played
        input.nextLine();
        String s = input.nextLine().toUpperCase();

        int Anton = 0;
        int Danik = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'A'){
                Anton++;
            }
            if(s.charAt(i) == 'D'){
                Danik++;
            }
        }
        if(Anton > Danik){
            System.out.println("Anton");
        }
        else if(Danik > Anton){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

        input.close();
    }
}
