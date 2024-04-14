import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//굉장히 어려운데, 이게 완전탐색 대표 문제 중 하나라고 한다.
class Query {
    int[] numbers;
    int strike;
    int ball;

    Query(int[] numbers, int strike, int ball) {
        this.numbers = numbers;
        this.strike = strike;
        this.ball = ball;
    }
}

public class Main {
    public static int countRemainingCandidates(List<Query> queries) {
        List<int[]> candidates = generateCandidates();
        for (Query query : queries) {
            candidates = filterCandidates(candidates, query);
        }
        return candidates.size();
    }

    private static List<int[]> generateCandidates() {
        List<int[]> candidates = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j != i) {
                    for (int k = 1; k <= 9; k++) {
                        if (k != i && k != j) {
                            candidates.add(new int[]{i, j, k});
                        }
                    }
                }
            }
        }
        return candidates;
    }

    private static List<int[]> filterCandidates(List<int[]> candidates, Query query) {
        List<int[]> filteredCandidates = new ArrayList<>();
        for (int[] candidate : candidates) {
            if (isMatchingCandidate(candidate, query)) {
                filteredCandidates.add(candidate);
            }
        }
        return filteredCandidates;
    }

    private static boolean isMatchingCandidate(int[] candidate, Query query) {
        int strike = 0, ball = 0;
        for (int i = 0; i < 3; i++) {
            if (candidate[i] == query.numbers[i]) {
                strike++;
            } else if (contains(query.numbers, candidate[i])) {
                ball++;
            }
        }
        return strike == query.strike && ball == query.ball;
    }

    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Query> queries = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String[] inputs = sc.nextLine().split(" ");
            int[] nums = new int[3];
            for(int j=0; j<3; j++) {
                nums[j] = inputs[0].charAt(j)-'0';
            }
            queries.add(new Query(nums, Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
        }
        int remainingCandidates = countRemainingCandidates(queries);
        System.out.println(remainingCandidates);
    }
}