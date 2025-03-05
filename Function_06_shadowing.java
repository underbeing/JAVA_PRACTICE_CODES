//shadowing in java
public class Function_06_shadowing {
    static  int x = 99;
    public static void main(String[] args) {
        System.out.println(x); //scope willbegin when value will be initialized
        int x;
        x=0;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
