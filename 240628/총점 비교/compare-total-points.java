import java.util.Arrays;
import java.util.Scanner;

class Score implements Comparable<Score>{
  String name;
  int sub1;
  int sub2;
  int sub3;

  public Score(String name, int sub1, int sub2, int sub3) {
    this.name = name;
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
  }

  public int compareTo(Score score) {
    return (this.sub1 + this.sub2 + this.sub3) - (score.sub1 + score.sub2 + score.sub3);
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
      System.out.printf("%s %d %d %d\n", scores[i].name, scores[i].sub1, scores[i].sub2, scores[i].sub3);
    }
  }
}