import java.util.Scanner;
public class NextRound {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] score = new int[50];
        int count = 0;

        for(int i=0; i<n; i++){
            score[i] = input.nextInt();
        }
        int k_th_score = score[k-1];
        for(int i=0; i<n; i++){
            if (score[i] >= k_th_score && score[i] > 0){
                count++;
            }
        }
        System.out.println(count + "\n");

        input.close();
    }
}
