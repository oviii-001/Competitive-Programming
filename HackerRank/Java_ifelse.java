import java.util.Scanner;
public class Java_ifelse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n % 2 == 0){
            if(2 <= n && n <= 5){
                System.out.println("Not Weird");
            }
            else if(6 <= n && n <= 20){
                System.out.print("Weird");
            }
            else if(n > 20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }

        input.close();
    }
}
