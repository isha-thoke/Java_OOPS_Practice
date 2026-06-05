import java.util.LinkedList;
public class ForEach {
public static void main(String[] args) {
 LinkedList<String> list = new LinkedList<>();
 list.add("ABC");
 list.add("BCA");
 list.add("CBA");
 list.add("DCA");

 for(String name : list){
    System.out.println(" HII , What is your name   "+ name);
 }    
}
}