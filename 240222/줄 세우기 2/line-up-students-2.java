import java.util.*;

class Student implements Comparator<Student> {
    int h;
    int w;
    int i;

    Student(int h, int w, int i) {
        this.h=h;
        this.w=w;
        this.i=i;
    }

    void print() {
        System.out.printf("%d %d %d\n",h,w,i);
    }

    @Override
    public int compare(Student a, Student b) {
        return a.i - b.i; //기본정렬?
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++) {
            students[i] = new Student(sc.nextInt(),sc.nextInt(),i+1);
        }

        Arrays.sort(students, (a,b) -> {
            if(a.h != b.h)
                return a.h-b.h;
            if(a.w != b.w)
                return b.w-a.w;
            return b.w-a.w;
        });

        for(Student student : students) {
            student.print();
        }
        
    }
}