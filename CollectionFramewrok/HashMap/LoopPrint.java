import java.util.HashMap;

public class LoopPrint {

    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

          map.put(101, "Isha");
          map.put(102, "Ishan");
          map.put(103, "Neha");
          map.put(105, "Sneha");

          for(Integer key : map.keySet()){
            System.out.println(key + " = " + map.get(key));
          }
    }
}