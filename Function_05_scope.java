public class Function_05_scope {
    public static void main(String[] args) {
        //block scope;
        int a = 99;
        {
            // int a = 34;  already initialised and cant initiaize again
            int c = 99;//will remain in the block cant be used outside the block
        }
    }
}
