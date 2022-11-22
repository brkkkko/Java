// 2. Вывести все простые числа от 1 до 1000

public class Main2 {

    public static boolean isSimple(int n){
        if(n == 2 || n == 3)
            return true;
        if(n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i * i <= n; i += 6)
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 1000;
        int i = 1;
        while(i != n){
            if (isSimple(i))
                System.out.println(i);
            i++;
        }
    }
}