// first binary search code. of floor
public class BS_03 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,7,8,12,23,34,45,56,67};
        int[] arr1 = {9,8,7,6,5,4,3,2,2,1,0};
        System.out.println(floor(arr, 9));
    }

    //return the index
    //return -1 if does not exist.
    static int floor(int[] arr, int target)
    {
            int start =0;
            int end=arr.length-1;
            boolean order = arr[start] < arr[end];

        while(start<=end){
            //find the middle element
            int mid = start +(end-start)/2; //might be possible start+end exceed the range of integer;

            // checking middle element
            if(target==arr[mid]){
                return mid;
            }

            // if ascending order
                if(order){
                    if(target<arr[mid]){
                        end = mid-1;
                    }
                    else if(target> arr[mid]){
                        start=mid+1;
                    }
                }

                // if its descending order
                else {
                    if(target>arr[mid]){
                        end = mid-1;
                    }
                    else if(target< arr[mid]){
                        start=mid+1;
                    }
                }
        }
        return end;
    }
}
