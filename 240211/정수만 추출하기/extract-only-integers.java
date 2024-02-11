import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] inputs = sc.nextLine().split(" ");
        int sum = 0;
        int len = inputs.length;

        for(int i=0;i<len;i++){
            
            int delimiter = -1;
            char[] cArr = inputs[i].toCharArray();
            for(int j=0;j<cArr.length;j++) {
                if(!('0' <= cArr[j] && cArr[j]<='9')) {
                    delimiter = j;
                }
            }

            if(delimiter!=-1){
                sum += Integer.parseInt(inputs[i].substring(0,delimiter));
            }
        }

        System.out.print(sum);

    }
}