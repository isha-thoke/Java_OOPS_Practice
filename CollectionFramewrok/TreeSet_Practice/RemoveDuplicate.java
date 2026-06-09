import java.util.TreeSet;

public class RemoveDuplicate {

public static void main(String[] args) {
    
    TreeSet<Integer> set = new TreeSet<>();

    set.add(20);
    set.add(78);
    set.add(45);
    set.add(12);
    set.add(20);

    System.out.println(set);

    System.out.println("Last remove  "+set.last());
    System.out.println("First remove "+ set.first());
}    
}