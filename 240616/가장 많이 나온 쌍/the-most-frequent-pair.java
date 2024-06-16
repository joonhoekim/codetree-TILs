import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    PairCounter counter = new PairCounter();
    int globalMax = 0;

    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (b < a) {
        int temp = a;
        a = b;
        b = temp;
      }
      globalMax = Math.max(globalMax, counter.addPair(a, b));
    }

    System.out.println(globalMax);
  }
}