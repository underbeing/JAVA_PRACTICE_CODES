
import java.util.Scanner;

public class Functions_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = sum(num1,num2);
                System.out.println(ans);
        
            }
            static int sum(int a , int b){
        return (a*b);
    }
}
