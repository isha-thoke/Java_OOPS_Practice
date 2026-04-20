import java.util.*;

//Store book details
class Book {
  String title;
  String author;
  int id;

  Book(String title, String author, int id) {
    this.title = title;
    this.author = author;
    this.id = id;
  }

  void displayDetails() {
    System.out.println("ID: " + id + "|Title: " + title + "|Author: " + author);
  }
}

public class LibararySystem {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> library = new ArrayList<>();

    System.out.println("--Welcome toIsha Library---");

    // Using loop multiple books add

    while (true) {
      System.out.println("\n 1.Add Books \t 2. Show Books \t 3. Exit");

      int choice = sc.nextInt();

      if (choice == 1) {
        System.out.println("Enter title : ");
        String title = sc.nextLine();
        System.out.println("Enter Author : ");
        String author = sc.nextLine();
        System.out.println("Enter Book ID");
        int id = sc.nextInt();

        library.add(new Book(title, author, id));
        System.out.println("Book Added Successfully !");
      } else if (choice == 2) {
        System.out.println("\n ----List of Books--");
        for (Book b : library) {
          b.displayDetails();
        }
      } else {
        break;
      }
    }
    System.out.println("Thank You For Using The System!");
    sc.close();
  }
}
