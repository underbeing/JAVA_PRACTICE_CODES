import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //Initialisaion
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
        }
        // Adding elements to the 2D ArrayList
        System.out.println("Enter 9 elements (row-wise):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        
        // Print the 2D ArrayList
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }
  
    }
}
