import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // command[0] = 식빵의 개수, command[1] = 레시피 암호문의 개수
            String[] firstLine = br.readLine().split(" ");
            int commandCount = Integer.parseInt(firstLine[1]);
            
            String secondlineInput = br.readLine();
            List<Character> list = new LinkedList<>();
            for (char c : secondlineInput.toCharArray()) {
                list.add(c);
            }
            ListIterator<Character> iterator = list.listIterator(list.size());

            // 명령 받기
            for (int i = 0; i < commandCount; i++) {
                String[] command = br.readLine().split(" ");
                try {
                    switch (command[0]) {
                        case "L":
                            if (iterator.hasPrevious()) iterator.previous();
                            break;
                        case "R":
                            if (iterator.hasNext()) iterator.next();
                            break;
                        case "D":
                            if (iterator.hasNext()) {
                                iterator.next();
                                iterator.remove();
                            }
                            
                            break;
                        case "P":
                            iterator.add(command[1].charAt(0));
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            // 최종 리스트 출력
            StringBuilder sb = new StringBuilder();
            for (Character c : list) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}