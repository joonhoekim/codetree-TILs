import java.util.Scanner;

class WeatherData{
    String date;
    String day;
    String weather;
    WeatherData(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
    void print() {
        System.out.printf("%s %s %s",date,day,weather);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //WeatherData[] wds = new WeatherData[n];

        WeatherData ans = new WeatherData("9999-99-99","","");
        String condi = "Rain";

        for(int i=0;i<n;i++) {
            WeatherData w = new WeatherData(sc.next(), sc.next(), sc.next());
            if(w.weather.equals(condi)) {
                if(w.date.compareTo(ans.date) < 0) {
                    ans = w;
                }
            }
        }

        ans.print();

    }
}