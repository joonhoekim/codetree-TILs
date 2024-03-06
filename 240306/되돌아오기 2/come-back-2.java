import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int originX = 0;
        int originY = 0;
        int x = originX;
        int y = originY;

        //L D R U
        int[] dx = new int[]{-1,0,1,0};
        int[] dy = new int[]{0,-1,0,1};

        int dirNum = 3;
        int ans = -1;
        int time = 0;
        String commandLine = sc.nextLine();

        loop: for(int i=0; i<commandLine.length(); i++) {
            char command = commandLine.charAt(time);
            time++;
            switch(command) {
                case 'L': dirNum = leftTurn(dirNum); break;
                case 'R': dirNum = rightTurn(dirNum); break;
                case 'F': 
                x+=dx[dirNum];
                y+=dy[dirNum];
                if(x==originX && y==originY) {
                    ans = time;
                    break loop;
                }
                
            }
            
        }
        
        System.out.print(ans);

        
    }

    static int leftTurn(int dirNum) {
        return (dirNum+1)%4;
    }

    static int rightTurn(int dirNum) {
        return (dirNum-1+4)%4;
    }
}