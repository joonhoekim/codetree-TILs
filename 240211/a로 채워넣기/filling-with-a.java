import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        arr[1] = arr[arr.length-2]='a';

        System.out.print(arr);
    }
}