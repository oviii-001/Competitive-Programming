import java.util.Scanner;
public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        double value = input.nextDouble();
        input.nextLine();
        
        String text = input.nextLine();

        System.out.println("String: " + text);
        System.out.println("Double: " + value);
        System.out.println("Int: " +  number);

        input.close();
    }
}
