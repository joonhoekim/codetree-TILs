import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*
     * 분석
     * - 입력
     *   - n = 코딩톡에 들어온 사람 수
     *   - m = 코딩톡에 올라간 메시지 수
     *   - p = 확인이 필요한 메세지 번호
     *   - 메세지 올린 사람, 해당 메세지의 읽지 않은 사람 수가 라인별로 들어옴(m개 라인)
     *
     * - 출력
     *   - p번째 메세지를 읽지 않았을 가능성이 있는 모든 사람의 이름을 사전순으로 정렬하여 공백을 사이에 두고 출력
     *
     * - 조건
     *   - 참여자 이름은 A to Z (단 26명 미만일 수 있음)
     *   - 메신저 방에 들어오면, 그 시점에 있는 모든 메세지는 읽었다고 가정
     *   - '메세지를 보냈다는 것'은 '방에 들어왔다는 것(그 시점 전부 읽음)'에 대한 충분조건임
     *
     * - 이해
     *   - '메세지 정보'라는 용어를 정의해서 내는 문제라 이해가 느려짐
     *   - '메세지 정보'는 시간 순서를 따르며, 각 라인이 발송된 메세지임
     *
     * 설계
     * - N번째 메세지 이후, 메세지를 발송한 사람은 '코딩톡 들어온 사람'이므로 확실히 읽은 사람
     * - N번째 메세지 발송자는 확실히 읽은 사람
     * - '읽지 않은 사람의 수'?... 그것을 알아도 누군가의 '읽지 않았을 가능성'을 완전히 지울 수 없지 않나?
     *   - 아 이전에 풀었던 '밀어내기'랑 유사한건가?
     * */

    /*
    이 테스트케이스를 보면, 1번째 메세지 안읽은 사람이 0이다. 이런 경우 전부 읽었다는 것이 성립한다.
    6 6 1
    D 0
    C 1
    B 2
    B 2
    A 2
    F 4
    * */

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int p = sc.nextInt();

    int[] senders = new int[n];
    int[] unreadCount = new int[n];
    for (int i = 0; i < m; i++) {
      //센더 ID를 int로 저장
      senders[i] = (sc.next().charAt(0) - 'A');
      unreadCount[i] = sc.nextInt();
    }

    if (unreadCount[p - 1] == 0) {
      return;
    }

    boolean[] possibleUnreadUserIds = new boolean[n];
    Arrays.fill(possibleUnreadUserIds, true);
    for (int checkedIdx = p - 1; checkedIdx < n; checkedIdx++) {
      possibleUnreadUserIds[senders[checkedIdx]] = false;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (possibleUnreadUserIds[i]) {
        sb.append((char) (i + 'A')).append(" ");
      }
    }

    System.out.println(sb);

  }
}