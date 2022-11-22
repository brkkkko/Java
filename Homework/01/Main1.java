//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Main1 {

    public static int factorial(int n){
        if (n == 0)
        return 1;
        else
        return (n*factorial(n-1));
    }

    public static int sum(int n){
        if(n == 1)
        return 1;
        else
        return (n+sum(n-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int s = sum(num);
        int f = factorial(num);
        System.out.println("Sum of [1;n] = " + s);
        System.out.println("Factorial of [1;n] = " + f);
    }
}