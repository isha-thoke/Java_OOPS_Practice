import java.util.ArrayList;

public class FirstLast {
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(34);
    list.add(56);
    list.add(54);
    list.add(32);

    list.remove(3);
    list.remove(1);

    System.out.println(list);
}
    
}