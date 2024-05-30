import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] devs = new int[n];
        for (int i = 0; i < n; i++) {
            devs[i] = sc.nextInt();
        }

        // 정렬+조합을 이용하면 n^6 에서 n^3 으로 시간복잡도 낮출 수 있다고 한다. 그건 백트래킹 이후에 배워서 써보자!
        int minDiff = GetMinDiffTwoTeam(devs);
        System.out.println(minDiff);
    }

    private static int GetMinDiffTwoTeam(int[] devs) {

        int globalMinDiff = Integer.MAX_VALUE;

        //핵심 : 완전탐색 가능하게 팀을 구성해보기
        //비효율적이지만 일단 순서고려하지 않고 만들어보고,
        //팀이 만들어지지 않게 될 경우도 포함하기
        for (int i = 0; i < n; i++) {
            int firstTeamMem1 = devs[i];
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                int firstTeamMem2 = devs[j];
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int secondTeamMem1 = devs[k];
                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k) continue;
                        int secondTeamMem2 = devs[l];
                        for (int m = 0; m < n; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            int thirdTeamMem1 = devs[m];
                            for (int o = 0; o < n; o++) {
                                if (o == i || o == j || o == k || o == l || o == m) continue;
                                int thirdTeamMem2 = devs[o];

                                try {
                                    int[] team = new int[] {
                                            firstTeamMem1 + firstTeamMem2,
                                            secondTeamMem1 + secondTeamMem2,
                                            thirdTeamMem1 + thirdTeamMem2
                                    };

                                    Arrays.sort(team);
                                    int eachMaxDiff = team[2] - team[0];
                                    globalMinDiff = Math.min(globalMinDiff, eachMaxDiff);

                                } catch (Exception e) {
                                    //quietly quit
                                }
                            }

                        }
                    }
                }

            }
        }

        return globalMinDiff;
    }
}