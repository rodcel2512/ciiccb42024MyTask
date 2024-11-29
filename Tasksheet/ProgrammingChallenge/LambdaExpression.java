package ProgrammingChallenge;
import java.util.*;
public class LambdaExpression {
    public static void main(String[] args) {
        int price = 1000;
        Discount tenPercent = p-> p - (p* 0.10);
        Discount twentyPercent = p-> p - (p* 0.20);
        Discount fiftyPercent = p-> p - (p* 0.50);
        System.out.printf("%.2f%n",tenPercent.dc(price));
        System.out.printf("%.2f%n",twentyPercent.dc(price));
        System.out.printf("%.2f%n",fiftyPercent.dc(price));
    }
public interface Discount {
    double dc (double p);
}
public interface Predicates<T> {
    boolean Test(T t);
} 
}
