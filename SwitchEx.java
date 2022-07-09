import java.util.*;

public class SwitchEx {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        switch (num){
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            case 30:
                System.out.println("Number is 30");
                break;
            default:
                System.out.println("Please Enter Number 10, 20 and 30 only");
        }
    }
}
