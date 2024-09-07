                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 23-06-2024 | 21:02:05            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class MatrixStabilization {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[][] a = new int[n][m];
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < m; k++) {
          a[j][k] = in.nextInt();
        }
      }
      stabilize(a);
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < m; k++) {
          System.out.print(a[j][k] + " ");
        }
        System.out.println();
      }
    }
  }

  public static void stabilize(int[][] a) {
    int n = a.length;
    int m = a[0].length;
    while (true) {
      int i = -1;
      int j = -1;
      for (int k = 0; k < n; k++) {
        for (int l = 0; l < m; l++) {
          if (isGreater(a, k, l)) {
            if (i == -1 || k < i || (k == i && l < j)) {
              i = k;
              j = l;
            }
          }
        }
      }
      if (i == -1) {
        break;
      }
      a[i][j]--;
    }
  }

  public static boolean isGreater(int[][] a, int i, int j) {
    int n = a.length;
    int m = a[0].length;
    if (i > 0 && a[i][j] <= a[i - 1][j]) {
      return false;
    }
    if (i < n - 1 && a[i][j] <= a[i + 1][j]) {
      return false;
    }
    if (j > 0 && a[i][j] <= a[i][j - 1]) {
      return false;
    }
    if (j < m - 1 && a[i][j] <= a[i][j + 1]) {
      return false;
    }
    return true;
  }
}