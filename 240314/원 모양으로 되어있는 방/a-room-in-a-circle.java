import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] capacities = new int[n];
        int manCount = 0;
        for(int i=0; i<n; i++) {
            capacities[i]=sc.nextInt();
            manCount+=capacities[i];
        }

        int minDistSum = Integer.MAX_VALUE;

        for(int roomNo=0; roomNo<n; roomNo++) {
            int movingManCount = manCount;
            int distSum = 0;
            int curRoom = roomNo;
            for(int i=0; i<n; i++) {
                movingManCount = movingManCount - capacities[curRoom];
                distSum += movingManCount;
                curRoom = nextRoomNo(curRoom, n);
            }
            minDistSum = Math.min(minDistSum, distSum);
        }

        System.out.print(minDistSum);
    }

    static int nextRoomNo(int roomNo, int roomCount) {
        return (roomNo+1)%roomCount;
    }
}