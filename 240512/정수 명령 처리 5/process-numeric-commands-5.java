import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //ArrayList 미니 버젼 구현 해보기
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size = 10;
    Integer[] arr = new Integer[size];
    int last = 0;

    //    push_back A: 정수 A를 동적 배열의 맨 뒤에 넣는 연산입니다.
    //    pop_back: 맨 뒤에 있는 정수를 하나 삭제합니다.
    //    size: 동적 배열에 들어있는 정수의 개수를 출력합니다.
    //    get k: k번째 숫자를 출력합니다.

    for (int i = 0; i < n; i++) {
      String command = sc.next();
      if (command.equals("push_back")) {
        if(last==size) {
          arr = grow(arr, arr.length/2);
        }
        int a = sc.nextInt();
        arr[last++] = a;
      } else if (command.equals("pop_back")) {
        arr[--last] = null;
      } else if (command.equals("size")) {
        System.out.println(last);
      } else if (command.equals("get")) {
        int k = sc.nextInt() - 1;
        System.out.println(arr[k]);
      }

    }

  }

  public static Integer[] grow(Integer[] origin, int grow) {
    Integer[] growed = new Integer[origin.length + grow];
    for (int i = 0; i < origin.length; i++) {
      growed[i] = origin[i];
    }
    return growed;
  }

}