import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
  String name;
  int height;
  int weight;

  public int getHeight() {
    return height;
  }

  public int getWeight() {
    return weight;
  }

  public Person(String name, int height, int weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Person[] people = new Person[n];

    for (int i = 0; i < n; i++) {
      people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
    }
    // Comparator로 오름차순 정렬 후 두번째 비교기 비교하는 thenComparing을 사용(몸무게는 내림차순/reversed())
    // 첫번째 비교 수행(키) 후 동일한 값을 가지고 두번째 정렬을 수행해야 하므로 thenComparing을 사용할 때 새 Comparator를 사용함
    Arrays.sort(people, 
        Comparator.comparingInt(Person::getHeight).thenComparing(Comparator.comparingInt(Person::getWeight).reversed()));

    for (Person person : people) {
      System.out.printf("%s %d %d\n", person.name, person.height, person.weight);
    }
  }
}