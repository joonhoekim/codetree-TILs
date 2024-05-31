import java.util.Arrays;
import java.util.Scanner;

//최대 개수를 확보하기 위한 탐색문제
//1회의 반값쿠폰이 있다. 주어진 예산에서 최대한 구매횟수를 늘리려면?
//선물을 학생들 순서를 고려해서 구매할 필요가 없다!
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int budget = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        //학생 순서를 고려할 필요가 없으므로, 저렴한 것부터 사주자.
        Arrays.sort(prices);

        // i번째 물건에 쿠폰을 적용해보고 몇개 구매할 수 있는지 확인
        int globalMaxBuyIdx = 0;
        for (int discountIdx = 0; discountIdx < n; discountIdx++) {
            int localBudget = budget;

            for (int buyedIdx = 0; buyedIdx < n; buyedIdx++) {
                if(buyedIdx==discountIdx) {
                    localBudget -= prices[buyedIdx]/2;
                } else {
                    localBudget -= prices[buyedIdx];
                }

                //예산 소진
                if(localBudget<0) {
                    globalMaxBuyIdx = Math.max(globalMaxBuyIdx, buyedIdx-1);
                    break;
                }

                //만약 전부 구매했다면..
                if(buyedIdx == n-1) {
                    globalMaxBuyIdx = Math.max(globalMaxBuyIdx, buyedIdx);
                    break;
                }
            }
        }

        System.out.println(globalMaxBuyIdx+1);
    }
}