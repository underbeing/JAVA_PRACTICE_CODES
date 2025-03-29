public class Q03_Min_element {
    public static void main(String[] args) {
        int[] arr ={13,12,2,3,2,1,32};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
            if(arr.length==0) return -1;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            return  min;
         }
}
  