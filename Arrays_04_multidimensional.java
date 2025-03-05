import java.util.Arrays;
import java.util.Scanner;

public class Arrays_04_multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println(arr.length);//np of rows
        int[][] arr2D = {
            {1,2,3},
            {4,6},
            {7,8,9}
        };
        //input
        for(int row =0;row<arr.length;row++){
            //for each col in every row
            for(int col =0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
        for(int row =0;row<arr.length;row++){
            //for each col in every row
            for(int col =0;col<arr[row].length;col++){
               System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
    }
}
}
