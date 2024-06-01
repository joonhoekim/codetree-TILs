import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// --문제--
// 여러개의 치즈가 있다. 그 중 정확히 '하나'의 치즈만 상했다.
// 상한 치즈를 먹으면 1초뒤부터 아프게 된다.
// 치즈를 먹은 기록, 아프다는 기록이 주어진다.
// 기록에 없어도 아픈 사람이 있을 수 있다.
// 먹은 기록은 확실하다. 기록 없이 먹은 사람은 없다.
// 상한 치즈를 먹은 사람들의 수로 가능한 '최댓값'을 구해라.

// --접근--
// 어떤 치즈가 상했는지를 먼저 알아내야 한다.
// n번째 치즈 탐색으로 접근하자.
// 치즈 먹고 싶다.

class EatRec {
    int manId;
    int cheeseId;
    int eatTime;

    public EatRec(int manId, int cheeseId, int eatTime) {
        this.manId = manId;
        this.cheeseId = cheeseId;
        this.eatTime = eatTime;
    }
}

class SymptomRec {
    int manId;
    int symptomTime;

    public SymptomRec(int manId, int symptomTime) {
        this.manId = manId;
        this.symptomTime = symptomTime;
    }
}

class Cheese {
    boolean isAlleged = false;
}

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int manCount = sc.nextInt();
        int cheeseCount = sc.nextInt();
        int eatRecCount = sc.nextInt();
        int symptomRecCount = sc.nextInt();

        EatRec[] eatRecs = new EatRec[eatRecCount];
        SymptomRec[] symptomRecs = new SymptomRec[symptomRecCount];

        for (int i = 0; i < eatRecCount; i++) {
            int manId = sc.nextInt();
            int cheeseId = sc.nextInt();
            int eatTime = sc.nextInt();
            eatRecs[i] = new EatRec(manId, cheeseId, eatTime);
        }

        for (int i = 0; i < symptomRecCount; i++) {
            int manId = sc.nextInt();
            int symptomTime = sc.nextInt();
            symptomRecs[i] = new SymptomRec(manId, symptomTime);
        }

        //여기까지 세팅이 완료되었다.
        //구해야 하는 것은, 아픈 사람의 수 최댓값이다.
        //생각나는 접근법은, 상해버린 치즈가 무엇일지 추론하고,
        //그것을 먹은 사람들의 수를 정답으로 하는 것이다.
        //만약 상해버린 치즈를 하나로 명확히 가정할 수 없는 경우,
        //상한 가능성이 있는 치즈를 먹은 사람들의 수를 정답으로 해야 할 것이다.

        //증상 기록에서 누가 언제 아팠는지를 확인해보고
        //증상 시간 -1 초 이하에 먹은 적 있는 치즈 번호를 사람별로 기록한다.

        //cheese 기록을 위해 배열을 만들어둔다.
        Cheese[] cheeses = new Cheese[cheeseCount];
        for(int i = 0; i < cheeseCount; i++) {
            cheeses[i] = new Cheese();
        }


        Set<Integer> atePeopleNum = new HashSet<>();
        //누가 아팠는지를 확인해보고
        for (SymptomRec symptomRec : symptomRecs) {
            //증상시간 -1초 이하에 먹은 적 있는 치즈 번호는 의심한다.
            //의심되는 치즈를 먹은 사람은 셋에 넣는다.
            for (EatRec eatRec : eatRecs) {
                boolean isInTime = eatRec.eatTime <= symptomRec.symptomTime - 1;
                if(isInTime) cheeses[eatRec.cheeseId-1].isAlleged = true;
                if(cheeses[eatRec.cheeseId-1].isAlleged) atePeopleNum.add(eatRec.manId);
            }
        }

        System.out.println(atePeopleNum.size());

    }
}