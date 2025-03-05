


public class ArmstrongNumber {
    public static void main(String[] args) {
       
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int num){
        //Scanner  sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int original = num;
        int sum =0;
        while(num>0){
            int rem = num%10;
            num=num/10;
            sum = sum+rem*rem*rem;
        }
        return sum == original;
    }
}
