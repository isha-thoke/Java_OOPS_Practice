import java.util.ArrayList;

public class ValueAdd {

   public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
 list.add(20);
list.add(45);
list.add(56);
System.out.println(list);

for(Integer n : list){
    System.out.println(n);
}

   } 
}