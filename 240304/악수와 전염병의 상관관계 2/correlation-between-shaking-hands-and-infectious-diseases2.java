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

            //일단 감염된 사람을 발견하면 SpreadCount 를 확인한다.
            //활성 상태라면 상대방도 감염된 상태인지 확인해보고
            // - 감염된 상태라면 둘 다 spreacount++
            // - 비감염 상태라면 전파 횟수에 따라 상대방도 감염시키고 전파 횟수를 늘린다.
            
            
            if( devs[handshakings[i].x-1].isInfected ) {
                if( devs[handshakings[i].x-1].spreadCount<=k ) {
                    if( devs[handshakings[i].y-1].isInfected ) {
                        devs[handshakings[i].x-1].spreadCount++;
                        devs[handshakings[i].y-1].spreadCount++;
                    } else {
                        devs[handshakings[i].y-1].isInfected = true;
                        devs[handshakings[i].x-1].spreadCount++;
                    }
                }
            }
            
            if( devs[handshakings[i].y-1].isInfected ) {
                if( devs[handshakings[i].y-1].spreadCount<=k ) {
                    if( devs[handshakings[i].x-1].isInfected ) {
                        devs[handshakings[i].x-1].spreadCount++;
                        devs[handshakings[i].y-1].spreadCount++;
                    } else {
                        devs[handshakings[i].x-1].isInfected = true;
                        devs[handshakings[i].y-1].spreadCount++;
                    }
                }
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