/*##########################################################
############################################################
###                                                      ###
###             Author: ISMAM HASAN OVI                  ###
###            Created: 22-08-2024 | 20:00:48            ###
###                                                      ###
############################################################
##########################################################*/


import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] tripletOne = new int[3]; //first triplet
        for(int i=0; i<3; i++){
            tripletOne[i] = in.nextInt();
        }

        int[] tripletTwo = new int[3];  //second triplet
        for(int i=0; i<3; i++){
            tripletTwo[i] = in.nextInt();
        }
        comparedTriplets(tripletOne, tripletTwo);

        in.close();
    
    }

    // method of comparing the triplets
    public static void comparedTriplets(int[] a, int[] b){
        int aliceScore = 0;
        int bobScore = 0;

        for(int i=0; i<3; i++){
            if(a[i]>b[i]){
                aliceScore++;
            }
            else if(a[i]<b[i]){
                bobScore++;
            }
            else if(a[i]==b[i]){
                //do nothing
            }
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}


