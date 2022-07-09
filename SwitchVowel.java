import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class SwitchVowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char letter = sc.next().charAt(0);
        String v = "Vowel";
        switch(letter){
            case 'a':
                System.out.println(v);
                break;
            case 'e':
                System.out.println(v);
                break;
            case 'i':
                System.out.println(v);
                break;
            case 'o':
                System.out.println(v);
                break;
            case 'u':
                System.out.println(v);
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
