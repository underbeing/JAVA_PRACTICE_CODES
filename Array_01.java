public class Array_01 {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];
        int[] skm = new int[3];
        //directly
        int[] skm2={2,3,4,4,3};
        
        int[] arr; //declaration of array geting defined in stack pointing to nothing

        arr = new int[4]; //inititalaisation actually here object is being created in the stack

        System.out.println(skm[2]);

        //string array
        String[] arrs= new String[5];
        System.out.println(arrs[2]);
    }
}
