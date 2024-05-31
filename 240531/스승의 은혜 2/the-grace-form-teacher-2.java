import java.util.Scanner;

//최대 개수를 확보하기 위한 탐색문제
//1회의 반값쿠폰이 있다. 주어진 예산에서 최대한 구매횟수를 늘리려면?
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int budget = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // i번째 물건에 쿠폰을 적용해보고 몇개 구매할 수 있는지 확인
        // O(n^2) 일 것이다.
        int globalMaxBuyIdx = 0;
        for (int discounted = 0; discounted < n; discounted++) {
            for (int buyedIdx = 0; buyedIdx < n; buyedIdx++) {
                int localBudget = budget;

                if(buyedIdx==discounted) {
                    budget -= prices[buyedIdx]/2;
                } else {
                    budget -= prices[buyedIdx];
                }

                //예산 소진
                if(budget<0) {
                    globalMaxBuyIdx = Math.max(globalMaxBuyIdx, buyedIdx);
                }
            }
        }

        //Idx 에서 +1 안해줘도 된다. buyed 는 못산 것이니까..
        System.out.println(globalMaxBuyIdx);
    }
}