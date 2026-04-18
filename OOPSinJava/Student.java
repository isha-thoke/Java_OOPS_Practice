package OOPSinJava;

public class Student {

  // Creating a new data type
  public static class StudentIn {
    String name;
    int rno;
    double percent;
  }

  public static void main(String args[]) {
    System.out.println("Hello");
    StudentIn sn = new StudentIn();
    sn.name = "Shivani";
    sn.rno = 123345;
    sn.percent = 67.8;

    StudentIn sn1 = new StudentIn();
    sn1.name = "Neha";
    sn1.rno = 123456;
    sn1.percent = 89.7;
    System.out.println(sn.name + " " + sn.rno + " " + sn.percent);
    System.out.println(sn1.name + " " + sn1.percent + " " + sn1.rno);
  }
}
