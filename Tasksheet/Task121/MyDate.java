package Task121;
import Task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1,1,1978); //set the date for `date1` to January 1st, 1978
        DateTask date2 = new DateTask(9,21,1984);//set the date for `date2` to September 21st, 1984.
        System.out.println(date1.toString());
        System.out.println(date2.toString());
       // display leapyears
        DateTask.leapYears(); //add Method leapYear
    }
}