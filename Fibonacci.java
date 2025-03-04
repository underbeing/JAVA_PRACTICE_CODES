public class Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,....
        int a = 0;
        int b = 1;
        int n = 5;
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
      System.out.println(b);
    }
}
