package Practice.lesson2;

// На вход подается строка. На выходе сжатая строка.
// Пример:
// In: aaabbcccc
// Out: 3a2b4c

import java.util.Scanner;

public class Main2 {

    public static String RLE(String a){
        int count = 1;
        String out = "";
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            if((i+1) < a.length()){
                if(a.charAt(i+1) == a.charAt(i) && (count < 9)){
                    count++;
            }
            else{
                build.append(out);
                build.append(count);
                build.append(a.charAt(i));
                count = 1;
            }
        }
        else{
            build.append(out);
            build.append(count);
            build.append(a.charAt(i));
        }
        }
        return build.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        System.out.println("Enter string: ");
        a = in.nextLine();
        System.out.println("New string: " + RLE(a));
        in.close();
    }
}
