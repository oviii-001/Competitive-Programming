import java.util.Scanner;
public class ClockConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for(int i=0; i<T; i++){
            String timeString = input.next();
            String[] timeParts = timeString.split(":");
            int hh = Integer.parseInt(timeParts[0]);
            int mm = Integer.parseInt(timeParts[1]);
            char ampm = timeString.charAt(timeString.length() - 2);

            // format hour and minute values with leading zeros
            String formattedHour = String.format("%02d", hh);
            String formattedMinute = String.format("%02d", mm);

            if(hh>12){
                System.out.println(24-hh + ampm + mm + "\n");
            }
            else if(hh==00){
                System.out.println(12 + ampm + mm + "AM\n");
            }
            else{
                System.out.println(formattedHour + ampm + formattedMinute + "AM\n");
            }
        }
        input.close();
    }
}