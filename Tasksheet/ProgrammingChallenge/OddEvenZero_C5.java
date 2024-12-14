package ProgrammingChallenge;

public class OddEvenZero_C5 {
    public String checkOddEven(int num){
        return (num%2==0)? "Even":"Odd";
    }
    public String checkZero(int num){
        return (num == 0)? "Zero":
                (num>0)? "Positive":"Negative";
    }
    public static void main(String[] args) {
        OddEvenZero_C5 Oez = new OddEvenZero_C5();
        System.out.println("Check Odd and Even: " + Oez.checkOddEven(12));
        System.out.println("Check is Positive, Negative and Zero number: "+Oez.checkZero(0));
    }
}
