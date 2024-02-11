import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] cArr = str.toCharArray();

        char first = cArr[0];
        int[] firstCheck = new int[cArr.length];
        int firstSize = 0;

        char second = cArr[1];
        int[] secondCheck = new int[cArr.length];
        int secondSize = 0;


        //첫번째 글짜와 같은 경우를 firstCheck에 인덱스들로 저장하기
        for(int i=0; i<cArr.length;i++){
            if(cArr[0]==cArr[i]){
                firstCheck[firstSize++]=i;
            }
        }

        //두번째 글짜와 같은 경우를 secondCheck에 인덱스들로 저장하기
        for(int i=0; i<cArr.length;i++){
            if(cArr[1]==cArr[i]){
                secondCheck[secondSize++]=i;
            }
        }

        for(int i=0;i<firstSize;i++){
            cArr[firstCheck[i]]=second;
        }

        for(int i=0;i<secondSize;i++){
            cArr[secondCheck[i]]=first;
        }

        System.out.print(cArr);



    }
}