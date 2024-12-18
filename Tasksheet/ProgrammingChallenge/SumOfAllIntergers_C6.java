package ProgrammingChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllIntergers_C6 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int result = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers seperated by space bar: ");
        
        for(int i=0; i < numbers.length; i++){
            int num = sc.nextInt();
            numbers[i] = num;
            
            result += num;
        }
        System.out.println("Three Numbers are:" + Arrays.toString(numbers));
        System.out.println("Sum of all numbers: "+result);
    }

}
