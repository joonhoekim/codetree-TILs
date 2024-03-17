import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 사람 수

        Person[] people = new Person[n]; // 사람들을 저장하는 배열

        // 각 사람의 위치와 팻말 정보를 입력받아 Person 객체를 생성하여 배열에 저장합니다.
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int position = Integer.parseInt(input[0]); // 위치
            char character = input[1].charAt(0); // 팻말
            people[i] = new Person(position, character);
        }

        // 팻말을 위치 순서대로 정렬합니다.
        Arrays.sort(people);

        int maxSize = 0; // 최대 사진 크기

        // 각 위치에서 시작하여 가능한 모든 사진 크기 확인
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int totalG = 0; // 'G'의 총 개수
                int totalH = 0; // 'H'의 총 개수

                // startPoint부터 endPoint까지 'G'와 'H'의 개수 합산
                for (int k = i; k <= j; k++) {
                    if (people[k].character == 'G') {
                        totalG++;
                    } else {
                        totalH++;
                    }
                }

                // 'G'와 'H'가 모두 없거나 개수가 같은 경우
                if ((totalG == 0 && totalH != 0) || (totalG != 0 && totalH == 0) || totalG == totalH) {
                    maxSize = Math.max(maxSize, people[j].position - people[i].position);
                }
            }
        }

        bw.write(maxSize + "\n"); // 최대 사진 크기 출력

        bw.flush();
        bw.close();
        br.close();
    }
}

class Person implements Comparable<Person> {
    int position;
    char character;

    public Person(int position, char character) {
        this.position = position;
        this.character = character;
    }

    // 위치를 기준으로 오름차순으로 정렬하기 위해 compareTo 메서드를 구현합니다.
    @Override
    public int compareTo(Person o) {
        return this.position - o.position;
    }
}