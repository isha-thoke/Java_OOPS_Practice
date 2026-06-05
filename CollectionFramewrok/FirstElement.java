import java.util.LinkedList;

public class FirstElement {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
   list.add(10);
   list.add(67);
   list.add(90);
   list.add(45);
   
   System.out.println(list.getFirst());
   System.out.println(list.getLast());

}
    
}