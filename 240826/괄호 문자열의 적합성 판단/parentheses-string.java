import java.util.Scanner;
import java.util.Stack;

public class Main {

  /*괄호만으로 이뤄진 입력이 주어진다.
   * 해당 입력이 완전히 열림-닫힘 쌍으로 이뤄진 것인지 판단해야 한다.
   * 괄호 안에 다른 괄호가 [여러 개] 들어갈 수 있다.
   *
   * 전략
   * ( = 스택에 넣는다
   * ) = 스택에서 꺼낸다.
   *
   * 그 과정에서 아래 실패 조건에 걸리면 안된다.
   * - 스택에 남은게 없는데 꺼내거나
   * - 마지막에 스택에 남은 게 있거나
   * */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();

    String input = sc.nextLine();
    boolean isSatisfied = true;
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push(input.charAt(i));
      } else if (input.charAt(i) == ')') {
        if (stack.isEmpty()) {
          isSatisfied = false;
          break;
        } else {
          stack.pop();
        }
      }
    }
    if (!stack.isEmpty()) {
      isSatisfied = false;
    }

    if (isSatisfied) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}