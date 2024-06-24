import java.util.Scanner;

class Person {
  String name;
  String address;
  String region;

  public Person(String name, String address, String region) {
    this.name = name;
    this.address = address;
    this.region = region;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Person[] people = new Person[n];

    for (int i = 0; i < n; i++) {
      people[i] = getPerson(sc);
    }

    int idx = 0;

    for (int i = 0; i < people.length; i++) {
      if (people[idx].name.compareTo(people[i].name) < 0) {
        idx = i;
      }
    }

    System.out.println("name " + people[idx].name);
    System.out.println("addr " + people[idx].address);
    System.out.println("city " + people[idx].region);
  }

  public static Person getPerson(Scanner sc) {
    return new Person(sc.next(), sc.next(), sc.next());
  }
}