import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Please write your code here.
    Scanner sc = new Scanner(System.in);

    double height = sc.nextDouble();
    double weight = sc.nextDouble();

    //Condition => Round-down
    int BMI = (int)( weight / (height*height) * 10000);

    System.out.println(BMI);
    if (BMI >= 25) {
      System.out.println("Obesity");
    }
  }
}