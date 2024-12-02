package ProgrammingChallenge;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] parameter = {4,5,10};
        int total = cumulativeSum(parameter);
        System.out.println("Total Sum: "+total);
    }
    public static int cumulativeSum(int... nums){
        int totalSum = 0;

        for (int num : nums) {
            int cumulativeSum = 0;
            for(int i = 1; i<= num; i++){
                cumulativeSum += i;
            }
            totalSum += cumulativeSum;
            System.out.println("Cumulative  Sum up to "+ num +": "+cumulativeSum);    
        }
        return totalSum;
    }
}
