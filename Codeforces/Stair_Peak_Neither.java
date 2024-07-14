import java.util.Scanner;
public class Stair_Peak_Neither {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for(int i=0; i<T; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if(a<b && b<c){
                System.out.println("STAIR\n");
            }
            else if(a<b && b>c){
                System.out.println("PEAK\n");
            }
            else{
                System.out.println("NONE\n");
            }
        }
        input.close();
    }
}