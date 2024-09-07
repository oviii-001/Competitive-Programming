import java.util.Scanner;

public class Watermelon {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int w= scanner.nextInt();  // watermelon count

    if(w%2==1){
        System.out.println("NO\n");
    }
    else{
        if(w==2){
         System.out.println("NO\n");
        }
        else{
         System.out.println("YES\n");
        }
   } 
   scanner.close();
}

}
