// public class Q05_even_digits {
//     public static void main(String[] args) {
//         int [] arr ={23,32,-3434,23,2,121,255};
//         System.out.println(findNumbers(arr));
//     }
//     static int findNumbers(int[] nums){
//         int count=0;
//          for(int num :nums){
//             if(even(num)){
//                 count++;
//             }
//          }
//          return count;
//     }
  
//     static boolean even(int num){
//         int no_of_digits = digits(num);
//         if(no_of_digits%2==0){
//             return true;
//         }
//         else return false;
//     }

//     static int digits (int num){
//         if(num<0){
//             num = -num;
//         }
//         int cnt =0;
//         while (num>0) {
//             cnt++;
//             num/=10;
//         }
//         return cnt;
//     }
// } 
//============================================================================

public class Q05_even_digits {
    public static void main(String[] args) {
        int[] arr={32,3434,433,2,6666,544444};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int cnt =0;
        while(num > 0) {
             cnt++;
            num /=10;
        }
        return cnt%2==0;
    }
}