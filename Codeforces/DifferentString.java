                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 10-05-2024 | 21:00:00            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class DifferentString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        for (int i = 0; i < testCase; i++) {
            String s = input.next();

            boolean canRearrange = false;

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) != s.charAt(0)){
                    canRearrange = true;
                    System.out.println("YES\n");
                    System.out.println(rearrangeString(s) + "\n");
                    break;
                }
            }
            if(!canRearrange){
                System.out.println("NO\n");
            }
        }
        input.close();    
    }
    public static String rearrangeString(String s){
        StringBuilder r = new StringBuilder(s);

        r.setCharAt(0, s.charAt(s.length()-1));
        r.setCharAt(s.length()-1, s.charAt(0));
        
        return r.toString();
    }
}
