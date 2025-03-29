public class LinearSearch_01 {
    public static void main(String[] args) {
        int[]  nums ={1,2,4,34,3,2,3123,52,3,123,636,32,23,23};
        boolean x = linearsearch3(nums, 123);
        System.out.println(x);
    }


    //search in the array : return the index if found
    static int linearsearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }

        //run a loop
        for (int index=0; index<arr.length;index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    
//====================================================================================
    static int linearsearch2(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }

        //run a loop
            for(int element : arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }

//===========================================================================================
static boolean linearsearch3(int[] arr, int target) {
    if(arr.length==0){
        return false;
    }

    //run a loop
    for(int element : arr){
        if(element==target){
            return true;
        }
    }
    return false;
}
}