import java.util.Scanner;
public class Java_Stdin_and_Stdout {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        input.close();

    }
}
