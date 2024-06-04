//이전에 풀었던 문제와 동일한데, 배송비 조건이 추가되었음

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        Cost[] clostCloned = new Cost[studentCount];

        for (int i = 0; i < studentCount; i++) {
            int price = sc.nextInt();
            int shippingCost = sc.nextInt();
            clostCloned[i] = new Cost(price, shippingCost);
        }

        Comparator<Cost> totalPriceAsc = new Comparator<Cost>() {
            @Override
            public int compare(Cost o1, Cost o2) {
                return (o1.price + o1.shippingCost) - (o2.price + o2.shippingCost);
            }
        };


        int answer = 0;
        for (int i = 0; i < clostCloned.length; i++) {
            Cost[] costCloned = clostCloned.clone();
            clostCloned[i].price = clostCloned[i].price / 2;
            Arrays.sort(costCloned, totalPriceAsc);
            int totalPrice = 0;
            for (int j = 0; j < costCloned.length; j++) {
                int cost = costCloned[i].price + costCloned[i].shippingCost;
                totalPrice += cost;
                if(totalPrice > budget) {
                    answer = Math.max(answer, j);
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}