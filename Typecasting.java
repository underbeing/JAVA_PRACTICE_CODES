
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num);
        int num1=(int)(2423.432);
        System.out.println(num1);

        int a = 257;
        byte b = (byte)(a); //257%256=1
        System.out.println(b);
    }
}
