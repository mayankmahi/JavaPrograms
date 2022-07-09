import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0)){
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("Common year");
        }
    }
}
