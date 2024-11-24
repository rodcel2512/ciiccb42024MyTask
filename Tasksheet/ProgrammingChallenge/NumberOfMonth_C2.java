package ProgrammingChallenge;

import java.util.Scanner;

public class NumberOfMonth_C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Months:");
        int numOfMonth = scanner.nextInt();
        int days;

        switch (numOfMonth) {
            case 1: System.out.println("January");
                    days = 31;
            ;break;
            case 2: System.out.println("Febuary");
                    days = 29;
            break;
            case 3: System.out.println("March");
                    days = 30;
            break;
            case 4: System.out.println("April");
                    days = 30;
            break;
            case 5: System.out.println("May");
                    days = 31;
            break;
            case 6: System.out.println("June");
                    days = 30;
            break;
            case 7: System.out.println("July");
                    days = 31;
            break;
            case 8: System.out.println("August");
                    days = 31;
            break;
            case 9: System.out.println("Septerber");
                    days = 30;
            break;
            case 10: System.out.println("October");
                    days = 31;
            break;
            case 11: System.out.println("November");
                    days = 30;
            break;
            case 12: System.out.println("December");
                    days = 31; 
            break;
            default: 
                days = -1;
            ;break;
        }
        if (days != -1)
            System.out.println("Number of days in Month: "+ days);
        else{
            System.out.println("Not valid Input!");
        }
    }

}
