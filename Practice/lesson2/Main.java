package Practice.lesson2;

// На вход подается число N и 2 символа. На выходе получаем строку длины N из повторяющихся 2 символов.
// Пример:
// In: 5
// In: a s
// Out: asasa

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1, c2;
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        System.out.println("Enter symbols c1, c2: ");
        c1 = in.next().charAt(0);
        c2 = in.next().charAt(0);
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i%2==0)
                build.append(c1);
            else
                build.append(c2);
        }
        System.out.println("String of [" + c1 + "] [" + c2 + "] is: " + build);
        in.close();
    }
}
