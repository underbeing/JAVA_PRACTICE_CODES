
import java.util.Arrays;
import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        //array of primitives
        int[] arr=new int[5];
        Scanner in = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int num : arr){
            System.out.print(num+ " ");
        }
        System.out.println(Arrays.toString(arr));
       
        //array of objects
        String[] str = new String[4];
        for(int i =0;i<str.length;i++){
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
