package Task119;

import java.util.Scanner;

public class AdvCalc extends Calc {
    public int multi(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number2: ");
        int num2 = scan.nextInt();

        System.out.println("Addition: " + ac.add(num1, num2));
        System.out.println("Subtraction: " + ac.sub(num1, num2));
        System.out.println("Multiplication: " + ac.multi(num1, num2));
        System.out.println("Division: " + ac.div(num1, num2));
    }
}
