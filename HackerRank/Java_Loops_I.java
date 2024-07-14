import java.util.Scanner;
public class Java_Loops_I {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int N = input.nextInt();
    int M = 1;

    while(M<=10){
        System.out.println(N + " x " + M + " = " + N*M);
        M++;
    }

    input.close();
  }  
}
