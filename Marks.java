import java.util.*;
public class Marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if(marks < 40){
            System.out.println("Pass: " + marks);
        } else if(marks >= 60 && marks <= 70){
            System.out.println("C Grade");
        } else if (marks >= 70 && marks <= 80) {
            System.out.println("B Grade");
        } else if (marks >=90 && marks < 100) {
            System.out.println("A Grade");
        } else if (marks >100) {
            System.out.println("Invalid Entry");
        } else if (marks == 100) {
            System.out.println("Excellent Performance");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}