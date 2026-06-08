import java.util.HashSet;

public class Loop_Use {
public static void main(String[] args) {
   
    HashSet<Integer> set = new HashSet<>();

    set.add(45);
    set.add(78);
    set.add(78);
    set.add(90);

    System.out.println(set.contains(78));

    for(Integer n : set){
        System.out.println(set);
    }

}
    
}