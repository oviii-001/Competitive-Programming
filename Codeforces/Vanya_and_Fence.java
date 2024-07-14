import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int NumberOfFriends = input.nextInt();
        int HeightOfTheFence = input.nextInt();

        int WidthOfFriends;
        int WidthOfTheRoad = 0;

        for(int i=0; i<NumberOfFriends; i++){
            int HeightOfFriends = input.nextInt();

            if(HeightOfFriends <= HeightOfTheFence){
                WidthOfFriends = 1;
            }
            else{
                WidthOfFriends = 2;
            }
            WidthOfTheRoad += WidthOfFriends;
        }
        System.out.println(WidthOfTheRoad);

        input.close();
    }
}
