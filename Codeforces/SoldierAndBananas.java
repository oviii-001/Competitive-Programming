import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt(); // k = cost of the first banana
        int n = input.nextInt(); // n = initial number of dollars the soldier has
        int w = input.nextInt(); // w = number of bananas the soldier has to buy

        int totalCost = 0;
        int CostOfEachBanana;

        for(int i=1; i<=w; i++){
            CostOfEachBanana = k * i;
            totalCost += CostOfEachBanana;
        }
        if(n >= totalCost){
            System.out.println(0);
        }
        else{
            int HeHaveToBorrow = totalCost - n;
            System.out.println(HeHaveToBorrow);
        }

        input.close();
    }
}
