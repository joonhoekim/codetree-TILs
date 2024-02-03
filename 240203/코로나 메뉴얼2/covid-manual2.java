import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] situ = new int[4];

    
    for(int i=0; i<3; i++) {
        char sym = sc.next().charAt(0);
        int tem = sc.nextInt();

        if(sym=='Y' && tem>=37) {
            //A
            situ[0]++;
        } else if(sym=='N' && tem>=37) {
            //B
            situ[1]++;
        } else if(sym=='Y') {
            //C
            situ[2]++;
        } else {
            //D
            situ[3]++;
        }
    }
    for(int i=0;i<situ.length;i++){
        System.out.print(situ[i]+" ");
    }
    if(situ[0]>=2) {
        System.out.print("E");
    }
        
    }
}