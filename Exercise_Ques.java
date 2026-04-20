import java.util.*;

public class Exercise_Ques {

  public static double calculateAverage(int num1, int num2, int num3) {
    int sum = 0;
    sum = num1 + num2 + num3;
    double average = sum / 3;
    return average;
  }

  public static void main(String arr[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = sc.nextInt();
    System.out.println("Enter second number");
    int num2 = sc.nextInt();
    System.out.println("Enter thrid number");
    int num3 = sc.nextInt();

    System.out.println("The average is : " + calculateAverage(num1, num2, num3));
    sc.close();
  }
}
