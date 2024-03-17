import java.util.ArrayList;
import java.util.Scanner;

class Person {
    int position;
    char character;

    public Person(int position, char character) {
        this.position = position;
        this.character = character;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        sc.nextLine(); // 개행 문자 처리

        ArrayList<Person> people = new ArrayList<>(); // 사람들을 저장하는 리스트

        // 각 사람의 위치와 팻말 정보를 입력받아 Person 객체를 생성하여 리스트에 저장합니다.
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt(); // 위치
            char character = sc.next().charAt(0); // 팻말
            people.add(new Person(position, character));
        }

        int maxSize = 0; // 최대 사진 크기

        // 각 위치에서 시작하여 가능한 모든 사진 크기 확인
        for (int startPoint = 0; startPoint <= 100; startPoint++) {
            // 시작점에 사람이 없으면 다음 위치로 건너뜁니다.
            if (!hasPerson(people, startPoint)) {
                continue;
            }
            for (int endPoint = startPoint; endPoint <= 100; endPoint++) {
                // 끝점에 사람이 없으면 다음 위치로 건너뜁니다.
                if (!hasPerson(people, endPoint)) {
                    continue;
                }
                int totalG = 0; // 'G'의 총 개수
                int totalH = 0; // 'H'의 총 개수

                // startPoint부터 endPoint까지 'G'와 'H'의 개수 합산
                for (Person person : people) {
                    if (person.position >= startPoint && person.position <= endPoint) {
                        if (person.character == 'G') {
                            totalG++;
                        } else {
                            totalH++;
                        }
                    }
                }

                // 'G'와 'H'가 모두 없거나 개수가 같은 경우
                if ((totalG == 0 && totalH != 0) || (totalG != 0 && totalH == 0) || totalG == totalH) {
                    maxSize = Math.max(maxSize, endPoint - startPoint);
                }
            }
        }

        System.out.println(maxSize); // 최대 사진 크기 출력
    }

    // 리스트에 주어진 위치에 사람이 있는지 확인하는 메서드
    private static boolean hasPerson(ArrayList<Person> people, int position) {
        for (Person person : people) {
            if (person.position == position) {
                return true;
            }
        }
        return false;
    }
}