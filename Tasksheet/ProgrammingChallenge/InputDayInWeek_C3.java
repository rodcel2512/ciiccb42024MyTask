package ProgrammingChallenge;
import java.util.*;
public class InputDayInWeek_C3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter number 1 to 7: ");
        
        if (s.hasNextInt()) {
            int day = s.nextInt();

            String week;
            switch (day) {
                case 1:
                    week = "Monday";
                    break;
                case 2:
                    week = "Tuesday";
                    break;
                case 3:
                    week = "Wednesday";
                    break;
                case 4:
                    week = "Thursday";
                    break;
                case 5:
                    week = "Friday";
                    break;
                case 6:
                    week = "Saturday";
                    break;
                case 7:
                    week = "Sunday";
                    break;
                default:
                    week = "Invalid input number!";
                    break;
            }
            System.out.println("Number equal to week: " + week);
        }
        else{
            System.out.println("Character is not valid!");
        }  
    }
}
