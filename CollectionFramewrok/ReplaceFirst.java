import java.util.LinkedList;
public class ReplaceFirst {
public static void main(String[] args) {   

LinkedList<String> list = new LinkedList<>();

list.add("Java");
list.add("Python");
list.add("C");
list.add("C++");
list.addFirst("JavaScript");
list.removeLast();

System.out.println(list);
//System.out.println(list.getLast());
}
}