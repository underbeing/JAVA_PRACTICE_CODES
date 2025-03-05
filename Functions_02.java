//returning a string from a function 
public class Functions_02 {
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(mygreet("saroj"));
    }
    static String greet() {
        return "saroj";
    }
    static  String mygreet(String name){
        String messsage = "Hello" + name;
        return messsage;
    }
}
