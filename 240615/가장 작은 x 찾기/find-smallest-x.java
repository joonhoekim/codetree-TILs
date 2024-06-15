import java.util.Scanner;

class Limit {
    int start;
    int end;
    Limit(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Limit[] limits = new Limit[n];
        for (int i = 0; i < n; i++) {
            limits[i] = new Limit(sc.nextInt(), sc.nextInt());
        }

        for (int i = 1; i <= 10000; i++) {
            if(check(limits, i)) {
                System.out.println(i);
                return;
            }
        }


    }

    public static boolean check(Limit[] limits, int i) {

        for(int seq = 0; seq < limits.length; seq++) {
            i *= 2;
            boolean isSatisfied = limits[seq].start <= i && i <= limits[seq].end;
            if(!isSatisfied) {
                return false;
            }
        }
        return true;
    }
}