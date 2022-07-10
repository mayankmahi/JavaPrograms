import java.util.*;

public class VPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pyramid Size");
        int size = sc.nextInt();

        for(int i = 1; i <= size; i++){
            for(int j=size; j>=i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
