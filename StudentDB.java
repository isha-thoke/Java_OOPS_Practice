import java.util.*;

class Student {
  String name;
  int rollNo;
  double marks;

  Student(String name, int rollNo, double marks) {
    this.name = name;
    this.marks = marks;
    this.rollNo = rollNo;
  }

  void display() {
    String status = (marks >= 33) ? "Pass" : "Fail";
    System.out.println("RollNo: " + rollNo + "|Name: " + name + "|Marks: " + marks + "%|Status: " + status);
  }
}

public class StudentDB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();

    while (true) {
      System.out.println("\n ---Student DataBase---");
      System.out.println("1. Add Student \t 2. View All \t  3. Exit");

      int choice = sc.nextInt();

      if (choice == 1) {
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Roll No :");
        int roll = sc.nextInt();
        System.out.println("Marks:");
        double m = sc.nextDouble();

        list.add(new Student(name, roll, m));
      } else if (choice == 2) {
        for (Student s : list)
          s.display();
      }

      else
        break;
    }
    sc.close();
  }
}
