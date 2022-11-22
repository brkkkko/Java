
// 4 (*) Задано уравнение вида q + w = e, где q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
import java.lang.String;

public class Main4 {

    public static boolean isTrue(int q, int w, int e) {
        if (q + w == e)
            return true;
        return false;
    }

    public static int ReplaceDigit(String a, char b) {
        a = a.replace('?', b);
        int n = Integer.parseInt(a);
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter q,w,e of equation (q + w = e): ");
        String eq = in.nextLine();
        try {
            if (eq.equals(""))
                throw new Exception("String can not be empty!");
            if (eq.matches("[a-zA-Z]+")) {
                throw new Exception("Only digits are allowed!");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);

        }
        String q = eq.substring(eq.indexOf(0) + 1, eq.lastIndexOf('+'));
        String w = eq.substring(eq.indexOf('+') + 1, eq.lastIndexOf('='));
        String e = eq.substring(eq.indexOf('=') + 1);
        char[] digits = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        int q_final = 0, w_final = 0, e_final = 0, count = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    q_final = ReplaceDigit(q, digits[i]);
                    w_final = ReplaceDigit(w, digits[j]);
                    e_final = ReplaceDigit(e, digits[k]);
                    if (isTrue(q_final, w_final, e_final)) {
                        System.out.println(q_final + " + " + w_final + " = " + e_final);
                        count++;
                    }
                    if (count == 1)
                        break;
                }
                if (count == 1)
                    break;
            }
            if (count == 1)
                break;
        }
        if (count == 0)
            System.out.println("NULL");
        in.close();
    }
}
