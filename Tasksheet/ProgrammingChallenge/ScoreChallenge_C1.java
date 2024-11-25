package ProgrammingChallenge;

public class ScoreChallenge_C1 {
    public static void main(String[] args) {
        int score;
        score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        }
        else if (score >= 80) {
            System.out.println("Grabe B");
        }
        else if (score >= 70) {
            System.out.println("Grade C");
        }
        else if (score >= 60) {
            System.out.println("Grade D");
        }
        else if (score <= 59) {
            System.out.println("Grade F");
        }
        else{
            System.out.println("Not valid input!");
        }
    }

}
