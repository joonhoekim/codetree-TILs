//이전에 풀었던 문제와 동일한데, 배송비 조건이 추가되었음
//왜 틀리는지 몰랐는데, 전부 다 구매 가능했을 때를 제대로 고려하지 못했었네!

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
            Cost[] costCloned = costs.clone();
            costCloned[i].price = costCloned[i].price / 2;
            Arrays.sort(costCloned, totalPriceAsc);
            int totalPrice = 0;
            int boughtCount = 0;
            for (int j = 0; j < costCloned.length; j++) {
                int cost = costCloned[i].price + costCloned[i].shippingCost;
                totalPrice += cost;
                boughtCount++;
                

                if(totalPrice > budget) {
                    maxBuyCount = Math.max(maxBuyCount, --boughtCount);
                    break;
                }
            }
        }

        System.out.println(maxBuyCount);

    }
}