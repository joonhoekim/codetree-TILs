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
        int p = sc.nextInt() -1; //최초 감염자 번호 toIdx
        int t = sc.nextInt(); //전체 악수 회수
        
        //1.setting
        Developer[] devs = new Developer[n];
        for(int i=0; i<n; i++) {
            devs[i] = new Developer();
        }
        devs[p].isInfected = true;
        Handshaking[] handshakings = new Handshaking[t];
        for(int i=0; i<t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt() -1 ; //to Idx
            int y = sc.nextInt() -1 ;
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

            //만약 둘 다 비감염이면 아무것도 안해도 됨. continue;
            //만약 둘 다 감염이면 
            // - 둘 다 전파제한 이상인 경우 continue;
            // - 둘 다 전파제한 미만인 경우 둘 다 늘려주고 continue;
            // - 하나만 전파제한 남은 경우 굳이 비교하기보다 둘 다 ++하고 continue;
            // ㄴ 생각해보니 그냥 다 ++ 해주면 되겠네
            
            //이제 한 쪽만 감염인 상태가 남음
            //감염된 쪽의 전파수 없으면 continue;
            //감염된 쪽의 전파수 남았으면 반대감염 및 전파수 증가


            //둘 다 비감염
            if( !devs[handshakings[i].x].isInfected && !devs[handshakings[i].y].isInfected ) {
                continue;
            }

            //둘 다 감염
            if( devs[handshakings[i].x].isInfected && devs[handshakings[i].y].isInfected ) {
                devs[handshakings[i].x].spreadCount++;
                devs[handshakings[i].y].spreadCount++;
                continue;
            }

            //한쪽만 감염된 경우
            if( devs[handshakings[i].x].isInfected && devs[handshakings[i].x].spreadCount<k ) {
                devs[handshakings[i].y].isInfected = true;
                devs[handshakings[i].x].spreadCount++;
            } else if ( devs[handshakings[i].y].isInfected && devs[handshakings[i].y].spreadCount<k ) {
                devs[handshakings[i].x].isInfected = true;
                devs[handshakings[i].y].spreadCount++;
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