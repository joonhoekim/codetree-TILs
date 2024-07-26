import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputLength = sc.nextInt();
    String input = sc.next();

    //전략
    /*
     * 작은 것에서 큰 것으로? 큰 것에서 작은 것으로?
     * => 큰 것에서 작은 것으로. (작은 건 유니크 문자열의 부분이어도 겹치니까)
     * 근데 문자열 길이는 왜 준거지.. 그냥 인풋들어온거 길이 확인하면 되는데 */

    /*
     * 우선 문제 이해가 까다로웠는데,
     * ABCDABC가 있다면, 'D'를 두고 최소 길이가 1이라고 할 수 없는 이유가
     * 1인 경우에는 A,B,C는 중복되기에 오답이 되기 떄문이라고 한다.
     * 이걸 이해하고 나니까 작은 것에서 큰것으로 검사하는게 더 좋은 방법인 것 같다.
     * 조건을 만족시키지 않으면 정답(길이)를 1씩 늘리는 거지..*/

    //쪼개기
    //사이즈 1부터 해서, 겹치는 게 있는지 확인한다.
    for (int size = 1; size <= inputLength; size++) {
      int count = 0;
      int maxStartIdx = inputLength - size;

      //첫번째 인덱스부터 동일 문자열이 있는지 검사한다. count >= 2 인 경우, 이 사이즈는 오답이다.
      for (int startIdx = 0; startIdx < maxStartIdx; startIdx++) {
        String subString = input.substring(startIdx, startIdx + size);
        count = (int) countOccurrences(input, subString);
        if (count != 1) {
          break;
        }
      }

      if (count == 1) {
        System.out.println(size);
        return;
      }

    }

  }
  //java 9
//  private static long countOccurrences(String str, String subStr) {
//    return Pattern.compile(Pattern.quote(subStr))
//            .matcher(str)
//            .results()
//            .count();
//
//  }

  private static long countOccurrences(String str, String subStr) {
    Matcher matcher = Pattern.compile(Pattern.quote(subStr)).matcher(str);
    long count = 0;
    while (matcher.find()) {
      count++;
    }
    return count;
  }
}