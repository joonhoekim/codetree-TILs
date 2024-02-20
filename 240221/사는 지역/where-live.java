import java.util.*;

class Person {
    String name;
    String address;
    String city;

    Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public void print() {
        System.out.printf("name %s\naddr %s\ncity %s\n", this.name, this.address, this.city);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i=0; i<n;i++) {
            people[i] = new Person(sc.next(), sc.next(), sc.next());
        }

        String[] names = new String[n];
        for (int i=0;i<n;i++) {
            names[i] = people[i].name;
        }
        Arrays.sort(names);

        for(int i=0;i<n;i++){
            if(people[i].name.equals(names[n-1])){
                people[i].print();
            }
        }

        
    }
}