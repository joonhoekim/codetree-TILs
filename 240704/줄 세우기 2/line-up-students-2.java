import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
  int no;
  int height;
  int weight;

  public Student(int no, int height, int weight) {
    this.no = no;
    this.height = height;
    this.weight = weight;
  }

  public int compareTo(Student student) {
    if (this.height == student.height) {
      return student.weight - this.weight;
    }
    return this.height - student.height;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    Student[] students = new Student[N];

    for (int i = 0; i < N; i++) {
      students[i] = new Student(i+1, sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(students);

    for (Student student : students) {
      System.out.printf("%d %d %d\n", student.height, student.weight, student.no);
    }
  }
}