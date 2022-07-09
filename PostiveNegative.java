//Program to Check Positive Negative Zero
import java.util.*;
public class PostiveNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive Number");
        } else if (num < 0){
            System.out.println("Negative Number");
        } else if (num == 0) {
            System.out.println("Neither Negative nor Positive");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
