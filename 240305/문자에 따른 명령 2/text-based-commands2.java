import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,-1,0,1};
    

    public static void main(String[] args) {
        String command = sc.next();
        //기본 = 북쪽 -> 3
        int dirNum = 3;
        int x = 0;
        int y = 0;
        
        for(int i=0;i<command.length(); i++) {
            char cursor = command.charAt(i);
            if(cursor=='L') {
                dirNum = (dirNum+1)%4;
            } else if(cursor=='R') {
                dirNum = (dirNum-1+4)%4;
            } else if(cursor=='F') {
                x+=dx[dirNum];
                y+=dy[dirNum];
            }
        }
        System.out.print(x+" "+y);
    }
}