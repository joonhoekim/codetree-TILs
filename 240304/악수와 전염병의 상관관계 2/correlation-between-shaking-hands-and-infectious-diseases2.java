import java.util.*;

class Developer {
    boolean isInfected;
    int spreadCount;
}

class Handshaking{
    int time;
    int x;
    int y;
    Handshaking(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt(); //인원 수
        int k = sc.nextInt(); //최대 전파 회수
        int p = sc.nextInt(); //최초 감염자 번호
        int t = sc.nextInt(); //전체 악수 회수
        
        //1.setting
        Developer[] devs = new Developer[n];
        for(int i=0; i<n; i++) {
            devs[i] = new Developer();
        }
        devs[p-1].isInfected = true;
        Handshaking[] handshakings = new Handshaking[t];
        for(int i=0; i<t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshakings[i] = new Handshaking(time, x, y);
        }
        Comparator<Handshaking> compByTime = new Comparator<Handshaking>() {
            @Override
            public int compare(Handshaking a, Handshaking b) {
                return Integer.compare(a.time, b.time);
            }
        };
        Arrays.sort(handshakings, compByTime);

        //2.simulation
        for(int i=0; i<t; i++) {
            if( devs[handshakings[i].x-1].isInfected && devs[handshakings[i].x-1].spreadCount<=k) {
                devs[handshakings[i].y-1].isInfected = true;
                devs[handshakings[i].x-1].spreadCount++;
            } 
        }

        //3.print
        for(int i=0; i<devs.length; i++) {
            if(devs[i].isInfected) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }



    }
}