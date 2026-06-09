import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {

    public static void main(String[] args) {
        
  HashSet<Integer> set =  new  HashSet<>();
   set.add(10);
set.add(45);
set.add(89);

Iterator<Integer> it = set.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
   
    
}
    }
    
}
