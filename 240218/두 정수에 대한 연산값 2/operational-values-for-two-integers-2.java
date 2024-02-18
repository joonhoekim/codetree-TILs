import java.util.Scanner;

class IntWrapper{
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        calc(a,b);

        System.out.print(a.value+" "+b.value);
    }

    static void calc(IntWrapper a, IntWrapper b) {
        
        if(a.value>b.value) {
            a.value *=2;
            b.value +=10;
        } else {
            b.value *=2;
            a.value +=10;   
        }
    }
}