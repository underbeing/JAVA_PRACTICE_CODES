public class LC_852 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(peek(arr));
    }
    static int peek(int[] arr){
        for(int i=1;i<arr.length;i++){
            if((arr[i-1]<arr[i]) && (arr[i]>arr[i+1])){
                return arr[i];
             }
        }
        return -1;
    }
}
