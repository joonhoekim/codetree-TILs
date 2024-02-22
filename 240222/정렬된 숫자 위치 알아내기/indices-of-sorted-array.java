import java.util.*;
import java.io.*;

class Num implements Comparator<Num>, Cloneable {
    int value;
    int idx;
    static int size=1;

    Num(int value){
        this.value = value;
        this.idx = size++;
    }

    @Override
    public int compare(Num a, Num b) {
        return 0; //use custom comparator only!!
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        Num[] nums = new Num[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            nums[i] = new Num(Integer.parseInt(st.nextToken()));
        }

        //value ASC
        Arrays.sort(nums, (a,b) -> {
            if(a.value != b.value)
                return a.value - b.value;
            return a.idx - b.idx;
        });

        //Num[] nums2 = new Num[n];
        Num.size=1;
        for(int i=0;i<n;i++) {
            nums[i] = new Num(nums[i].idx);
        }


        //value ASC
        Arrays.sort(nums, (a,b) -> {
                return a.value - b.value;
        });

        for(Num num : nums) {
            bw.write(num.idx + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}