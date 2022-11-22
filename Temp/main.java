public class main {
public static void main(String[] args){
    int value = 321;
    int count = 0;
    int v1 = value;

    while (value != 0){
        value /= 10;
        count++;
    }
    System.out.println("Digits in number " + v1 + " is " + count);
}
}