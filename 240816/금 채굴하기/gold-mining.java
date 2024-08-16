import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static List<int[]> goldPositions = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    goldPositions.add(new int[]{i, j});
                }
            }
        }

        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxGold = Math.max(maxGold, getMaxGoldFromCenter(i, j));
            }
        }

        System.out.println(maxGold);
    }

    static int getMaxGoldFromCenter(int centerX, int centerY) {
        int maxGold = 0;
        int[][] visited = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{centerX, centerY, 0});
        visited[centerX][centerY] = 1;
        int goldCount = isGoldPosition(centerX, centerY) ? 1 : 0;
        int maxK = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], k = current[2];

            if (k > maxK) {
                int cost = k * k + (k + 1) * (k + 1);
                if (goldCount * m >= cost) {
                    maxGold = goldCount;
                    maxK = k;
                } else {
                    break;
                }
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && visited[nx][ny] == 0) {
                    visited[nx][ny] = 1;
                    queue.offer(new int[]{nx, ny, k + 1});
                    if (isGoldPosition(nx, ny)) {
                        goldCount++;
                    }
                }
            }
        }

        return maxGold;
    }

    static boolean isGoldPosition(int x, int y) {
        for (int[] gold : goldPositions) {
            if (gold[0] == x && gold[1] == y) {
                return true;
            }
        }
        return false;
    }
}