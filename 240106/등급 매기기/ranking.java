import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    String grade = "ABCDF";
    for(int criteria=90, gradeIndex=0; gradeIndex<grade.length(); criteria-=10,gradeIndex++) {
      if(score>=criteria) {
        System.out.println(grade.charAt(gradeIndex));
        return;
      }
    }
    //System.out.println(grade.charAt(4));
  }
}