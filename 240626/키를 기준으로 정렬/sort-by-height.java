import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  static class Student implements Comparable<Student> {
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
      return this.height - student.height;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Student[] students = new Student[n];
    for (int i = 0; i < n; i++) {
      students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(students);

    for (int i = 0; i < n; i++) {
      System.out.println(students[i].name + " " + students[i].height + " " + students[i].weight);
    }
  }
}