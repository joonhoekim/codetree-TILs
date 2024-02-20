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
        WeatherData[] wds = new WeatherData[n];
        for(int i=0;i<n;i++) {
            wds[i] = new WeatherData(sc.next(), sc.next(), sc.next());
        }

        String condi = "Rain";
        int tgtIdx = -1;
        for(int i=0;i<n;i++) {
            if(wds[i].weather.equals(condi)){
                tgtIdx = i;
                break;
            }
        }

        for(int i=0;i<n;i++) {
            if(wds[tgtIdx].date.compareTo(wds[i].date)>0 && wds[i].weather.equals(condi)) {
                tgtIdx = i;
            }
        }
        
        wds[tgtIdx].print();

    }
}