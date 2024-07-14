import java.util.Scanner;
public class Team {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int TestCase = input.nextInt();
    input.nextLine();
    int count = 0;
    
    for(int i=0; i<TestCase; i++){
        int Petya = input.nextInt();
        int Vasya = input.nextInt();
        int Tonya = input.nextInt();

        int TotalSolutions = Petya + Vasya + Tonya;

        if(TotalSolutions >= 2){
            count++;
        }
    }
    System.out.println(count + "\n");
    input.close();
   } 
}
