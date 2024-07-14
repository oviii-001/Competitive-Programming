import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int TestCase = input.nextInt();
        for(int i=0; i<TestCase; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            if(a==(b+c) || b==(a+c) || c==(b+a)){
                System.out.println("YES\n");
            }
            else{
                System.out.println("NO\n");
            }
        }
        input.close();
    }
}
