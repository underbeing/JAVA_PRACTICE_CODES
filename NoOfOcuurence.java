
import java.util.Scanner;

public class NoOfOcuurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int count=0;
        int num=sc.nextInt();
        while(num>0){
            int rem = num%10;
            num/=10;
            if(rem==3){
                count++;
            }
        }
        System.out.println(count);
    }
}
