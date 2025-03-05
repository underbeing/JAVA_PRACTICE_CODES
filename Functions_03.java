//swapping two numbers through functions
public class Functions_03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b); //reference copy is passed
        System.out.println(a +" "+ b);
        int temp = a;
        a= b;
        b=temp;
        System.out.println(a +" "+ b);
    }
    static void swap(int a,int b){
        int tem = a;
        a= b;
        b=tem;

    }
}
 