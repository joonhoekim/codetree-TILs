import java.util.*;

class Person implements Comparator<Person> {
    String name;
    int height;
    float weight;

    Person(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    void print(){
        System.out.printf("%s %d %.1f\n",name,height,weight);
    }

    @Override
    public int compare(Person obj1, Person obj2) {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[] persons = new Person[n];

        for(int i=0;i<n;i++){
            String name = sc.next();
            int height = sc.nextInt();
            float weight = sc.nextFloat();
            persons[i] = new Person(name,height,weight);
        }

        Arrays.sort(persons, (obj1, obj2) -> {
            return obj1.name.compareTo(obj2.name);
        });

        System.out.println("name");
        for(Person person : persons) {
            person.print(); //이름 ASC 출력
        }

        System.out.println();

        System.out.println("height");
        Arrays.sort(persons, (obj1, obj2) -> {
            return obj2.height - obj1.height;
        });

        for(Person person : persons) {
            person.print(); //이름 ASC 출력
        }


            
        


    }
}