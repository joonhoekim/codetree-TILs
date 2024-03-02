import java.util.*;
//import java.io.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int size = 1_000_000 + 1; //biggest N or M * biggest t
  static int[] timeArrA = new int[size];
  static int[] timeArrB = new int[size];

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int m=sc.nextInt();

    int time = 0;
    int cursor = 0;
    for(int i=0; i<n; i++) {
      int v = sc.nextInt();
      int t = sc.nextInt();
      while(t-->0) {
        timeArrA[++time] = (cursor += v);
      }
    }

    time = 0;
    cursor = 0;
    for(int i=0; i<m; i++) {
      int v = sc.nextInt();
      int t = sc.nextInt();
      while(t-->0) {
        timeArrB[++time] = (cursor += v);
      }
    }


    int prev = 0;
    int current = 0;
    int count = 0;
    for(int i=0; i<size; i++) {
      if (i==0) {
        if(timeArrA[i] > timeArrB[i]) {
          prev = 1;
        } else {
          prev = 2;
        }
        continue;
      }

      if(current == 0 && prev ==0) {
        break;
      }

      if(timeArrA[i] > timeArrB[i]) {
        current = 1;
      } else {
        current = 2;
      }

      if(current!=0 && current!=prev) {
        count++;
      }
      prev=current;

      
    }

    System.out.print(count);

  }
}