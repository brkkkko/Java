// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// import java.util.Scanner;

// public class Main {

//     public static int factorial(int n){
//         if (n == 0)
//         return 1;
//         else
//         return (n*factorial(n-1));
//     }

//     public static int sum(int n){
//         if(n == 1)
//         return 1;
//         else
//         return (n+sum(n-1));
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = in.nextInt();
//         int s = sum(num);
//         int f = factorial(num);
//         System.out.println("Sum of [1;n] = " + s);
//         System.out.println("Factorial of [1;n] = " + f);
//     }
// }

// 2. Вывести все простые числа от 1 до 1000

// public class Main {

//     public static boolean isSimple(int n){
//         if(n == 2 || n == 3)
//             return true;
//         if(n <= 1 || n % 2 == 0 || n % 3 == 0)
//             return false;
//         for(int i = 5; i * i <= n; i += 6)
//             if(n % i == 0 || n % (i+2) == 0)
//                 return false;
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 1000;
//         int i = 1;
//         while(i != n){
//             if (isSimple(i))
//                 System.out.println(i);
//             i++;
//         }
//     }
// }

// 3. Реализовать простой калькулятор
// import java.util.Scanner;

// public class Main {

//     public static double sum(double a, double b){
//         return a+b;
//     }

//     public static double mult(double a, double b) {
//         return a*b;
//     }

//     public static double sub(double a, double b){
//         return a-b;
//     }

//     public static double div(double a, double b){
//         try {
//             if(b == 0)
//                 throw new Exception();
//         } catch (Exception e) {
//             if (b == 0)
//             System.err.println("YOU CANNOT DIVIDE BY 0 (in the field of R)");
//         }
//         return a / b;
//     }


//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter two numbers: ");
//         double a = in.nextDouble();
//         double b = in.nextDouble();
//         System.out.println("Choose math operator(+,-,*,/): ");
//         char s = in.next().charAt(0);
//         switch(s){
//             case '+': System.out.println(a + " "  + s + " " + b + " = " + sum(a,b));
//                 break;
//             case '-': System.out.println(a + " "  + s + " " + b + " = " + sub(a,b));
//                 break;
//             case '/':  
//                 if(b != 0)
//                     System.out.println(a + " "  + s + " " + b + " = " + div(a,b));
//                 break;
//             case '*': System.out.println(a + " "  + s + " " + b + " = " + mult(a,b));
//                 break;
//             default: System.err.println("ERROR!");
//                 return;
//         }
//         in.close();
//     }
// }

// 4 (*) Задано уравнение вида q + w = e, где q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
import java.lang.String;

public class Main4 {


    public static boolean isTrue(int q, int w, int e){
        if(q + w == e)
            return true;
        return false;
    }
    
    public static int ReplaceDigit(String a, char b){
        a = a.replace('?', b);
        int n = Integer.parseInt(a);
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter q,w,e of equation (q + w = e): ");
        String eq = in.nextLine();
        String q = eq.substring(eq.indexOf(0) + 1,eq.lastIndexOf('+'));
        String w = eq.substring(eq.indexOf('+') + 1,eq.lastIndexOf('='));
        String e = eq.substring(eq.indexOf('=') + 1);
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int q_final = 0, w_final = 0, e_final = 0, count = 0;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                for(int k = 0; k < 9; k++)
                {
                    q_final = ReplaceDigit(q, digits[i]);
                    w_final = ReplaceDigit(w, digits[j]);
                    e_final = ReplaceDigit(e, digits[k]);
                    if(isTrue(q_final, w_final, e_final))
                        {
                            System.out.println(q_final + " + " + w_final + " = " + e_final);
                            count++;
                        }
                    if(count == 1)
                        break;
                }
                if(count == 1)
                        break;
            }
            if(count == 1)
                        break;
        }
        if(count == 0)
        System.out.println("NULL");
        in.close();
    }
}


        