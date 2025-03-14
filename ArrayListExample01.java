
import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(3423);
        System.out.println(list);
        System.out.println(list.contains(23));
        list.set(0, 99);
        list.remove(1);
        System.out.println(list);
        System.out.println(list);
    }
}
