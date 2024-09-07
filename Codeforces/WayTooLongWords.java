import java.util.Scanner;

public class WayTooLongWords {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int n=input.nextInt();
    input.nextLine();

    for(int i=0;i<n;i++){
        String word = input.nextLine();
        int length = word.length();

        if(length>10){
            System.out.printf("%c%d%c\n", word.charAt(0), length-2, word.charAt(length-1));
        }
        else{
            System.out.printf("%s\n", word);
        }
   }
   input.close(); 
}
}
