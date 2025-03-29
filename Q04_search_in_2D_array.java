
import java.util.Arrays;



public class Q04_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr={
            {23,2,21,32},
            {32,2,3,23,23},
            {4324,3424,4,34,3}
        };
        int target =34;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max_search(arr));
    }
    static int[] search(int[][] arr,int target){
        // if(arr.length==0) {
        //     return -1;
        // }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1}; 
    }
    //================================================================

    static int max_search(int[][] arr){
        // if(arr.length==0) {
        //     return -1;
        // }
        int max= Integer.MIN_VALUE;
        for(int[] ar: arr){
            for(int a:ar) {
                if(a>max){
                    max=a;
                }
            }
        }
        return max; 
    }
}
