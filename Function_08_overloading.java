//This code is for function overloading
public class Function_08_overloading {
    public static void main(String[] args) {
        fun(34);
        fun("saroj");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
