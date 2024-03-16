import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

        //initial setting
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        //가로/세로/대각선 탐색 => dxdy 탐색법 추천
        //왼쪽부터 반시계로 45도씩 Idx 할당
        int[] drow = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        int[] dcol = new int[]{-1, -1, 0, 1, 1, 1, 1, 0, -1};

        String answer = "LEE";
        int answerFoundCount = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

                //여기서 board[i][j]!=answer.charAt(0) 인 경우 continue 시키면 더 빨라질 것
                if(board[i][j]!=answer.charAt(0)) continue;

                for(int dirNum=0; dirNum<drow.length; dirNum++) {
                    
                    //위에서 첫번쨰는 검사했으므로
                    int count = 1;
                    
                    for(int order=1; order<answer.length(); order++) { //1부터 시작 (0은 검사완료)

                        int nrow = i + drow[dirNum] * order;
                        int ncol = j + dcol[dirNum] * order;
                        //보드 밖으로 나갔을 때, 혹은 정답과 다른 문자열일 때는 break;
                        if(isOut(nrow,ncol,n,m)) {
                            break;
                        } else if(board[nrow][ncol] != answer.charAt(order)) {
                            break;
                        }
                        //위 조건에 모두 해당하지 않는 경우
                        count++;
                    }

                    if(count == answer.length()) {
                        answerFoundCount++;
                    } 
                }

            }
        }
        
        System.out.println(answerFoundCount);

    }

    static boolean isOut (int r, int c, int rCount, int cCount) {
        if(0<=r && 0<=c && r<rCount && c<cCount) {
            return false;
        }
        return true;
    }
}