import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] devs = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            devs[i] = sc.nextInt();
            sum += devs[i];
        }
        int globalMinDiff = Integer.MAX_VALUE;

        //idx 분배하기
        for (int teamSolo = 0; teamSolo < n; teamSolo++) {
            for (int teamAMem1 = 0; teamAMem1 < n; teamAMem1++) {
                if (teamAMem1 == teamSolo) continue;

                for (int teamAMem2 = 0; teamAMem2 < n; teamAMem2++) {
                    if (teamAMem2 == teamSolo || teamAMem2 == teamAMem1) continue;


                    int teamSoloSum = devs[teamSolo];
                    int teamASum = devs[teamAMem1] + devs[teamAMem2];
                    int teamBSum = sum - teamASum - teamSoloSum;
                    int[] teams = new int[3];
                    teams[0] = teamSoloSum;
                    teams[1] = teamASum;
                    teams[2] = teamBSum;

                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    Set<Integer> set = new HashSet<>();
                    boolean duplicated = false;
                    for (int team : teams) {
                        if (!set.add(team)) {
                            duplicated = true;
                            break;
                        }
                        min = Math.min(min, team);
                        max = Math.max(max, team);
                    }

                    int diff = max - min;


                    if (diff == 0 || duplicated) {
                        break;
                    }
                    globalMinDiff = Math.min(globalMinDiff, diff);


                }

            }

        }
        if(globalMinDiff == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        System.out.println(globalMinDiff);
    }
}