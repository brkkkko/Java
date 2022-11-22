import java.util.Scanner;
import java.time.LocalDateTime;

// public class Main {
// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int hour = LocalDateTime.now().getHour();

//     System.out.print("Enter the name: ");
//     String name = in.nextLine();

//     if(hour >= 5 && hour < 12){
//         System.out.println("Good morning " + name + "!");
//     }

//     else if(hour >= 12 && hour < 17){
//         System.out.println("Good afternoon " + name + "!");
//     }

//     else if(hour >= 17 && hour < 23){
//         System.out.println("Good evening " + name + "!");
//     }

//     else if(hour >= 23 && hour < 4){
//         System.out.println("Good night " + name + "!");
//     }

//     in.close();

// }

// }

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array: ");

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1)
                count++;
            if(count>max)
                max = count;
            if(a[i] == 0)
                count = 0;
    }
    System.out.println(max);
}
}