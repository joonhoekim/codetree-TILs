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
// n번째 치즈가 상했다는 탐색으로 접근해서
// 기록을 만족시키는 경우 그 치즈를 먹은 사람의 수를 구하자.

// --생각--
// 이 문제는 정확히 하나의 치즈가 상했다는 조건이 없으면 오히려 더 쉬운 문제가 될 것이다.
// 그러면 증상을 유발한 치즈 리스트를 구한 다음에, 해당 치즈를 먹은 사람들의 수만 구하면 될 것이다. 
// 치즈 먹고 싶다. 안 상한 걸로.

class EatRec {
    int manIdx;
    int cheeseIdx;
    int eatTime;

    public EatRec(int manIdx, int cheeseIdx, int eatTime) {
        this.manIdx = manIdx;
        this.cheeseIdx = cheeseIdx;
        this.eatTime = eatTime;
    }
}

class SymptomRec {
    int manIdx;
    int symptomTime;

    public SymptomRec(int manIdx, int symptomTime) {
        this.manIdx = manIdx;
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
            int manId = sc.nextInt() - 1;
            int cheeseId = sc.nextInt() - 1;
            int eatTime = sc.nextInt();
            eatRecs[i] = new EatRec(manId, cheeseId, eatTime);
        }

        for (int i = 0; i < symptomRecCount; i++) {
            int manId = sc.nextInt() - 1;
            int symptomTime = sc.nextInt();
            symptomRecs[i] = new SymptomRec(manId, symptomTime);
        }

        //cheese 기록을 위해 배열을 만들어둔다.
        Cheese[] cheeses = new Cheese[cheeseCount];
        for (int cheeseIdx = 0; cheeseIdx < cheeseCount; cheeseIdx++) {
            cheeses[cheeseIdx] = new Cheese();
        }

        //하나의 cheese가 상했다고 가정할 때 기록과의 '완전일치' 여부를 확인해본다.
        //그 치즈가 유일하게 상한 치즈이다! 증상기록에 하나라도 모순되면 안된다.
        int allegedCheese = 0;
        for (int cheeseIdx = 0; cheeseIdx < cheeseCount; cheeseIdx++) {
            int checkCount = 0;
            for (SymptomRec symptomRec : symptomRecs) {
                for (EatRec eatRec : eatRecs) {

                    if (symptomRec.manIdx == eatRec.manIdx) {
                        boolean isEaten = eatRec.eatTime <= symptomRec.symptomTime - 1;
                        if (isEaten) {
                            checkCount++;
                        }
                    }


                }
            }
            if (checkCount == symptomRecCount) {
                allegedCheese = cheeseIdx;
                break;
            }
        }

        Set<Integer> atePeopleSet = new HashSet<>();

        for (EatRec eatRec : eatRecs) {
            if(eatRec.cheeseIdx == allegedCheese) atePeopleSet.add(eatRec.manIdx);
        }
        

        System.out.println(atePeopleSet.size());

    }
}