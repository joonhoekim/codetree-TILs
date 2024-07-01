import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
  String name;
  int height;
  double weight;

  public Student(String name, int height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getHeight() {
    return height;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Student[] students = new Student[5];

    for (int i = 0; i < 5; i++) {
      students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
    }

    System.out.println("name");
    Arrays.sort(students, Comparator.comparing(Student::getName));
    for (Student student : students) {
      System.out.printf("%s %d %.1f\n", student.name, student.height, student.weight);
    }

    System.out.println();

    System.out.println("height");
    Arrays.sort(students, Comparator.comparingInt(Student::getHeight).reversed());
    for (Student student : students) {
      System.out.printf("%s %d %.1f\n", student.name, student.height, student.weight);
    }
  }
}