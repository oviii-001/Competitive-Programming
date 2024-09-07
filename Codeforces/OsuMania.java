/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 03-09-2024 | 20:55:31            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class OsuMania {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            in.nextLine();
            
            while (n-- > 0) {
                int m = in.nextInt();
                in.nextLine();
                
                int[] res = new int[m];
                
                for (int i = 0; i < m; i++) {
                    String row = in.nextLine();
                    
                    for (int j = 0; j < 4; j++) {
                        if (row.charAt(j) == '#') {
                            res[i] = j + 1;
                            break;
                        }
                    }
                }
                
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

