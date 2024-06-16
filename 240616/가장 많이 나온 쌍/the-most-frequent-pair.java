import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Pair {

  int min;
  int max;
  int count;

  Pair(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (getClass() != o.getClass()) {
      return false;
    }
    Pair pair = (Pair) o;
    return min == pair.min && max == pair.max;
  }

}

class PairCounter {

  private Set<Pair> set;

  public PairCounter() {
    set = new HashSet<>();
  }

  public int addPair(int a, int b) {
    Pair newPair = new Pair(a, b);
    for (Pair pair : set) {
      if (pair.equals(newPair)) {
        pair.count++;
        return pair.count;
      }
    }
    newPair.count = 1;
    set.add(newPair);
    return newPair.count;
  }
}

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    PairCounter counter = new PairCounter();
    int globalMax = 0;

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if (b < a) {
        int temp = a;
        a = b;
        b = temp;
      }
      globalMax = Math.max(globalMax, counter.addPair(a, b));
    }

    bw.write(String.valueOf(globalMax));
    bw.flush();
    bw.close();
    br.close();
  }
}