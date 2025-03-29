
import java.util.Arrays;

public class Max_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7};
        //System.out.println(max(arr));
        //System.out.println(maxrang (arr,2,6));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //  static int max(int[] arr) {
    //     if(arr.length==0) return -1;
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     return  max;
    //  }
    //  static int maxrang(int[] arr,int start, int end) {
    //     if(end>start) return -1;
    //     if(arr == null) return -1; 
    //     int max = Integer.MIN_VALUE;
    //     for(int i=start;i<= end;i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     return  max;
    //  }
     static void reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
     }
     static  void swap (int[] arr, int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;
    }
}
