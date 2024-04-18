import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Command {
  // a번, b번 종이컵을 교체하고
  // c번 종이컵 안에 들어있는지 확인해야 한다.
  int a;
  int b;
  int c;
}

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Command[] commands = new Command[n];
    for (int i = 0; i < n; i++) {
      commands[i] = new Command();
      StringTokenizer st = new StringTokenizer(br.readLine());
      commands[i].a = Integer.parseInt(st.nextToken());
      commands[i].b = Integer.parseInt(st.nextToken());
      commands[i].c = Integer.parseInt(st.nextToken());
    }

    int maxCount = 0;

    // 야바위에서 넣을 수 있는 곳이 3곳이므로, 각각 넣어본다.
    for (int start = 1; start <= 3; start++) {
      int[] cups = new int[3];
      cups[start - 1] = 1;
      int count = 0;
      for (Command command : commands) {
        int temp = cups[command.a - 1];
        cups[command.a - 1] = cups[command.b - 1];
        cups[command.b - 1] = temp;
        if (cups[command.c - 1] == 1) {
          count++;
        }
      }
      maxCount = Math.max(count, maxCount);

    }
    System.out.println(maxCount);
  }
}