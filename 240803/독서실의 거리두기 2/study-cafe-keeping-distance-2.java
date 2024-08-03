import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        
        List<Integer> occupied = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (seats.charAt(i) == '1') {
                occupied.add(i);
            }
        }
        
        int maxDistance = 0;
        
        // 양 끝 좌석 처리
        if (occupied.isEmpty()) {
            maxDistance = N - 1;
        } else {
            maxDistance = Math.max(occupied.get(0), N - 1 - occupied.get(occupied.size() - 1));
        }
        
        // 중간 좌석들 처리
        for (int i = 0; i < occupied.size() - 1; i++) {
            int gap = occupied.get(i + 1) - occupied.get(i) - 1;
            maxDistance = Math.max(maxDistance, (gap + 1) / 2);
        }
        
        System.out.println(maxDistance);
    }
}