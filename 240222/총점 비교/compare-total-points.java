import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int a;
    int b;
    int c;

    Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void print(){
        System.out.printf("%s %d %d %d\n",name,a,b,c);
    }

    @Override
    public int compareTo(Student student) {
        int sum1 = this.a + this.b + this.c;
        int sum2 = student.a + student.b + student.c;

        return sum1 - sum2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++) {
            String name = sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            students[i]=new Student(name,a,b,c);
        }

        Arrays.sort(students);

        for(Student student : students){
            student.print();
        }
    }
}