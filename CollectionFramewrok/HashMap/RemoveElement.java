import java.util.HashMap;

public class RemoveElement {

public static void main(String[] args) {
    
    HashMap<Integer, String> map = new HashMap<>();

    map.put(101, "Ram");
    map.put(102, "Shivain");
    map.put(103, "Shivaye");
    map.remove(101);
System.out.println(map);
}   
}