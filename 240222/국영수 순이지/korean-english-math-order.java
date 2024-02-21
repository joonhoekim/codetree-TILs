import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    void print() {
        System.out.printf("%s %d %d %d\n", name, kor, eng, math);
    }

    @Override
    public int compareTo(Student student) {
        if(this.kor != student.kor) 
            return  student.kor - this.kor;
        if(this.eng != student.eng)
            return student.eng - this.eng;
        return student.math - this.math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for(Student student : students){
            student.print();
        }
    }
}