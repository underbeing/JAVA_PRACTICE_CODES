public class BS_04 {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};
       System.out.println(FindingRange(arr, 2 ));
        }

        static int FindingRange(int[] arr,int target){
            //first find the range
            //first start with a box of 2
            int start =0;
            int end =1;

            //condition for the target to lie in the range
             while(target>arr[end]){
                int temp = end+1;//this is my new start
                //double the box value
                //end = prev end + sizeofbox*2
                end = end + 2*(end-start +1);
                start =temp;
             }
             return binarysearch(arr,target,start,end);
        }
        //returns the index value of target
        static int binarysearch(int[] nums, int target, int start,int end) {
            while(start<=end) {
                int mid = start +(end-start)/2;
    
                if(target<nums[mid]){
                    end =mid-1;
                }
                else if(target>nums[mid]){
                    start =mid+1;
                }
                else {
                  return mid;
                }
            }
            return -1;
        }
    }

