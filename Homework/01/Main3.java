// 3. Реализовать простой калькулятор
import java.util.Scanner;

public class Main3 {

    public static double sum(double a, double b){
        return a+b;
    }

    public static double mult(double a, double b) {
        return a*b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double div(double a, double b){
        try {
            if(b == 0)
                throw new Exception();
        } catch (Exception e) {
            if (b == 0)
            System.err.println("YOU CANNOT DIVIDE BY 0 (in the field of R)");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Choose math operator(+,-,*,/): ");
        char s = in.next().charAt(0);
        switch(s){
            case '+': System.out.println(a + " "  + s + " " + b + " = " + sum(a,b));
                break;
            case '-': System.out.println(a + " "  + s + " " + b + " = " + sub(a,b));
                break;
            case '/':  
                if(b != 0)
                    System.out.println(a + " "  + s + " " + b + " = " + div(a,b));
                break;
            case '*': System.out.println(a + " "  + s + " " + b + " = " + mult(a,b));
                break;
            default: System.err.println("ERROR!");
                return;
        }
        in.close();
    }
}