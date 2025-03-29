public class Q02_search_in_range {
    public static void main(String[] args) {
        int[] arr = {323,3,23,44,3,2,43,34,24,234,34,34,32,3,4,423,434,32};
         System.out.println(linearsearch(arr, 3, 3, 7));
    }
    static int linearsearch(int[] arr, int target,int start,int end) {
        if(arr.length==0){
            return -1;
        }

        //run a loop
        for (int index=start; index<=end;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
