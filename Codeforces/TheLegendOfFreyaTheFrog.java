/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 03-09-2024 | 21:06:53            ###
###                                                      ###
############################################################
##########################################################*/

import java.util.Scanner;

public class TheLegendOfFreyaTheFrog {

    public static int minJ(int x, int y, int k) {
        int j = 0;
        int cX = 0, cY = 0;

        while (cX != x || cY != y) {
            int rX = x - cX;
            int jX = Math.min(rX, k);
            cX += jX;
            j++;

            if (cX == x && cY == y){
                break;
            }

            int rY = y - cY;
            int jY = Math.min(rY, k);
            cY += jY;
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int k = in.nextInt();

            int res = minJ(x, y, k);
            System.out.println(res);
        }
        in.close();
    }
}