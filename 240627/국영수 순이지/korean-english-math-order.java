import java.util.Arrays;
import java.util.Scanner;

class Score implements Comparable<Score>{
  String name;
  int kor;
  int eng;
  int math;

  public Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public int compareTo(Score score) {
  if (this.kor == score.kor) {
    if (this.eng == score.eng) {
      return score.math - this.math;
    }
    return score.eng - this.eng;
  }
    return score.kor - this.kor;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Score[] scores = new Score[n];
    for (int i = 0; i < n; i++) {
      scores[i] = new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(scores);

    for (int i = 0; i < n; i++) {
      System.out.printf("%s %d %d %d\n", scores[i].name, scores[i].kor, scores[i].eng, scores[i].math);
    }
  }
}