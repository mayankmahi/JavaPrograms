import java.util.*;
public class BloodDonation {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc1.nextInt();

        if(age >= 18){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Weight");
            int Weight = sc2.nextInt();
            if(Weight > 50){
                System.out.println("You are Eligble to donate Blood");
            } else {
                System.out.println("Your Weight must be greater than 50KG");
            }
        } else {
            System.out.println("Your age must be 18 to donate blood");
        }
    }
}
