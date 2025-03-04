
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String fruit = sc.next();
         switch (fruit) {
             case "Mango" -> System.out.println("king pf fruits");
             default -> throw new AssertionError();
         }
    }
}
