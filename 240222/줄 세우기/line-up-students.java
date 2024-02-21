import java.util.*;

class Student implements Comparable<Student> {
    int number;
    int height;
    int weight;

    Student(int number, int height, int weight) {
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

    void print() {
        System.out.printf("%d %d %d\n",height, weight, number);
    }

    @Override
    public int compareTo(Student student){
        if(student.height != this.height)
            return student.height - this.height;
        if(student.weight != this.weight)
            return student.weight - this.weight;
        return this.number - student.number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=1; i<=n; i++) {
            int number = i;
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i-1] = new Student(number, height, weight);
        }

        Arrays.sort(students);
        for(Student student : students)
            student.print();

    }
}