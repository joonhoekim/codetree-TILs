//이전에 풀었던 문제와 동일한데, 배송비 조건이 추가되었음
//경계: 하나도 못 살때, 제한된 수를 살 수 있을 때, 다 살수 있을 때
//clone()은 얕은 복사!!!

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Cost {
    int price;
    int shippingCost;

    Cost(int price, int shippingCost) {
        this.price = price;
        this.shippingCost = shippingCost;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int studentCount = sc.nextInt();
        int budget = sc.nextInt();
        Cost[] costs = new Cost[studentCount];

        for (int i = 0; i < studentCount; i++) {
            int price = sc.nextInt();
            int shippingCost = sc.nextInt();
            costs[i] = new Cost(price, shippingCost);
        }

        Comparator<Cost> totalPriceAsc = new Comparator<Cost>() {
            @Override
            public int compare(Cost o1, Cost o2) {
                return (o1.price + o1.shippingCost) - (o2.price + o2.shippingCost);
            }
        };


        int maxBuyCount = 0;
        for (int i = 0; i < costs.length; i++) {
//            System.out.printf("---할인idx: %d, 할인전 가격: %d ---\n",i,costs[i].price);
            Cost[] costCloned = new Cost[studentCount];
            for (int j = 0; j < studentCount; j++) {
                costCloned[j] = new Cost(costs[j].price, costs[j].shippingCost);
            }
            costCloned[i].price = costCloned[i].price / 2;
            Arrays.sort(costCloned, totalPriceAsc);
            int totalPrice = 0;
            int boughtCount = 0;
            for (int j = 0; j < costCloned.length; j++) {
                int cost = costCloned[j].price + costCloned[j].shippingCost;
                totalPrice += cost;

                if (totalPrice > budget) {
                    break;
                }
                boughtCount++;
            }
            maxBuyCount = Math.max(maxBuyCount, boughtCount);
        }

        System.out.println(maxBuyCount);

    }
}