import java.util.Scanner;
public class DominoPiling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        int AreaRectangular = M*N;
        int AreaDomino = 2*1;

        int Maximum_Domino = AreaRectangular / AreaDomino;

        System.out.println(Maximum_Domino + "\n");

        input.close();
    }
}
