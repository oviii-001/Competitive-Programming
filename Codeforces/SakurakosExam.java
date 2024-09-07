/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 01-09-2024 | 21:15:10            ###
###                                                      ###
############################################################
##########################################################*/

import java.util.Scanner;

public class SakurakosExam {
    public static boolean  checkingSum(int a, int b){
        int totalSum = a + (b*2);
        if(totalSum % 2 != 0) return false;

        int halfSum = totalSum/2;
        for (int i = 0; i <= b; i++) {
            if (2*i <= halfSum && halfSum-2*i <= a) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i=0; i<n; i++){
                int a = input.nextInt();
                int b = input.nextInt();

                System.out.println(checkingSum(a,b) ? "YES" : "NO");
            }
            
        }
    }
}
