import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Please write your code here.
    Scanner sc = new Scanner(System.in);
    
    //if - else if - else VS use index...
    //제출 확인해보니 if문으로 구성한 것이 120ms 정도로 훨씬 빠르고
    //내가 작성한건 240ms 정도로 훨씬 느리긴 한데
    //나중에 확장가능성이 이렇게 다루는게 더 낫겠다...
    //..? 이유를 모르겠는데 재실행보니 144ms 가 나왔다.
    //걸리는 시간에 편차가 크게 나올 수 있구나.
    int score = sc.nextInt();
    String grade = "ABCDF";
    
    
    for(int criteria=90, gradeIndex=0; gradeIndex<grade.length(); criteria-=10,gradeIndex++) {
      if(score>=criteria) {
        System.out.println(grade.charAt(gradeIndex));
        return;
      }
    }
    System.out.println(grade.charAt(grade.length()-1));
  }
}