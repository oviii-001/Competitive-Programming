import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int step = 0;

        while (a <= b) {
            a = a * 3; 
            b = b * 2; 
            step++;  
        }
        System.out.println(step);

        input.close();
    }
}
