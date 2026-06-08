import java.util.HashSet;

public class Duplicate {
public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
   set.add("Java");
   set.add("Python");
    set.add("Java");

    System.out.println("Remove Duplicate "+ set);

}
    
}