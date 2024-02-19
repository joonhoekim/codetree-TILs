public class Main {
    static int seriesSum(int n){
        if(n==1) {
            return 1;
        }
        return seriesSum(n-1) + n;
    }
    public static void main(String[] args) {
        System.out.print(seriesSum(100));
    }
}