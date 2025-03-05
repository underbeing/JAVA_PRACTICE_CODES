
import java.util.Arrays;

//change value through functions i.e through functions
public class Function_04 {
    public static void main(String[] args) {
       //create an array
       int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void change(int[] nums){
        nums[0] = 99;
    }
}
