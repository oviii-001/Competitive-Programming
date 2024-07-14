import java.util.Scanner;
public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++){
            String text = input.next();
            int number = input.nextInt();

            System.out.println(text + "          " + String.format("%03d", number));
        }
        System.out.println("================================");

        input.close();
    }
}
