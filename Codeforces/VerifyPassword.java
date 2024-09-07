                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 07-06-2024 | 01:30:05            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Arrays;
import java.util.Scanner;

public class VerifyPassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();  // test caes
        input.nextLine();

        for(int i=0; i<t; i++){
            int n = input.nextInt();  // the length of the password 
           String password = input.next();  // the password

           if(password_is_strong(password)){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
        }
        input.close();
    }
    static boolean password_is_strong(String password){
        char[] charPassword = password.toCharArray();
        Arrays.sort(charPassword);
        String sortedPassword = new String(charPassword);

        if(!password.equals(sortedPassword)){
            return false;
        }
        for(int i=0; i<password.length()-1; i++){
            if(Character.isLetter(password.charAt(i)) && Character.isDigit(password.charAt(i+1))){
                return false;
            }
        }
        return true;
    }
}
