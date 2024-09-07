                                    /*##########################################################
                                    ############################################################
                                    ###                                                      ###
                                    ###             Author: ISMAM HASAN OVI                  ###
                                    ###            Created: 23-05-2024 | 00:53:57            ###
                                    ###                                                      ###
                                    ############################################################
                                    ##########################################################*/


import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int y = input.nextInt();  // the year number

        while(true){
            y++;
            String year = Integer.toString(y);
            boolean isBeautiful = true;
            for(int i=0; i<year.length()-1; i++){
                for(int j=i+1; j<year.length(); j++){
                    if(year.charAt(i) == year.charAt(j)){
                        isBeautiful = false;
                        break;
                    }
                }
                if(!isBeautiful){
                    break;
                }
            }
            if(isBeautiful){
                System.out.println(y);
                break;
            }
        }
        input.close();
    }
}
