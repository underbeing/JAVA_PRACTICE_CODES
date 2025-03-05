
import java.util.Arrays;

//passing in  functions of array
public class Array_03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(nums[0]);
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
