import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 버림
        
        int[][] queries = new int[N][3];
        int[] count1 = new int[N];
        int[] count2 = new int[N];
        
        // 입력 받기
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            queries[i][0] = Integer.parseInt(input[0]);
            count1[i] = Integer.parseInt(input[1]);
            count2[i] = Integer.parseInt(input[2]);
        }
        
        // 가능성 있는 수의 개수 계산
        int possibleNumbers = 0;
        for (int num = 111; num <= 999; num++) {
            int[] digits = new int[3];
            digits[0] = num / 100; // 백의 자리
            digits[1] = (num % 100) / 10; // 십의 자리
            digits[2] = num % 10; // 일의 자리
            
            boolean isValid = true;
            for (int i = 0; i < N; i++) {
                int[] queryDigits = new int[3];
                queryDigits[0] = queries[i][0] / 100;
                queryDigits[1] = (queries[i][0] % 100) / 10;
                queryDigits[2] = queries[i][0] % 10;
                
                int countCorrect = 0;
                int countDifferentPosition = 0;
                
                for (int j = 0; j < 3; j++) {
                    if (digits[j] == queryDigits[j]) {
                        countCorrect++;
                    } else if (digits[j] == queryDigits[0] || digits[j] == queryDigits[1] || digits[j] == queryDigits[2]) {
                        countDifferentPosition++;
                    }
                }
                
                if (countCorrect != count1[i] || countDifferentPosition != count2[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                possibleNumbers++;
            }
        }
        
        System.out.println(possibleNumbers);
    }
}