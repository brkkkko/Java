package Practice.lesson2;
import java.util.Scanner;

// На вход подается строка. Является ли строка палиндромом.

public class Main3 {

    public static boolean isPalindrome(String a) {
        return a.equals(new StringBuilder(a).reverse().toString());
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = in.nextLine();
        if(isPalindrome(a)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        in.close();
    }
}
