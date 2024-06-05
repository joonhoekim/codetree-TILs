import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Cost {
    int price;
    int shippingCost;

    Cost(int price, int shippingCost) {
        this.price = price;
        this.shippingCost = shippingCost;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int studentCount = Integer.parseInt(st.nextToken());
        int budget = Integer.parseInt(st.nextToken());
        Cost[] costs = new Cost[studentCount];

        for (int i = 0; i < studentCount; i++) {
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int shippingCost = Integer.parseInt(st.nextToken());
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