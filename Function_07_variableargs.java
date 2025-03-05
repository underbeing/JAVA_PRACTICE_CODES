import java.util.Arrays;

public class Function_07_variableargs {
    public static void main(String[] args) {
        fun(2,2,2,3,13,213,2,3,213,3,1231);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b,int ...v){

    }
}
