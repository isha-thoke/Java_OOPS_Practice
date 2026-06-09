import java.util.HashMap;

public class GetValue {

    public static void main(String[] args) {
        
   HashMap<Integer,String> map = new HashMap<>();
    
   map.put(101, "Java");
   map.put(102, "Python");
   map.put(103,"AL Tool" );

   System.out.println(map);

   System.out.println(map.get(101));
    }
}