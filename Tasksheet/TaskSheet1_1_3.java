public class TaskSheet1_1_3 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;
        for (int i = 0; i <=check_number; i++){
            message = (i%2==0) ? "even" : "odd";
            System.out.println(i+" is an "+message+" number");
        }
    }

}
