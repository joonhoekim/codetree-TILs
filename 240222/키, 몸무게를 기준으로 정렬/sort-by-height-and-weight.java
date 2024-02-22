import java.util.*;
import java.io.*;

class Person implements Comparator<Person> {
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //print output for answer
    void print() {
        System.out.printf("%s %d %d\n",name,height,weight);
    }

    //default comparator
    @Override
    public int compare(Person a, Person b) {
        return a.name.compareTo(b.name);
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Person[] persons = new Person[n];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            persons[i] = new Person(name,height,weight);
        } 

        Arrays.sort(persons, (a,b) -> {
            if(a.height!=b.height)
                return a.height - b.height;
            if(a.weight!=b.weight)
                return b.weight - a.weight;
            return 0;
        });

        for(Person person : persons) {
            person.print();
        }
        
    }
}