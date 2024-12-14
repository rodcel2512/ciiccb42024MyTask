package ProgrammingChallenge;
import java.util.Arrays;
import java.util.Scanner;
public class CheckLargeNumber_C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        System.out.println("Enter 1st number: ");
        nums[0] = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        nums[1] = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        nums[2] = sc.nextInt();

        if (nums [0] == nums [1] && nums [1] == nums [2]) {
            System.out.println("All numbers are equal");
        } else {
            int large = nums[0];

        for (int i=1; i <nums.length; i++)
        {
            
            if (nums[i] > large) {
            large = nums[i];
            System.out.println("The largest number " + large);
        }
    }
  }
 }
}

