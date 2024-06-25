import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Forecast {
  Date date;
  String day;
  String weather;

  public Forecast(Date date, String day, String weather) {
    this.date = date;
    this.day = day;
    this.weather = weather;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Forecast[] forecasts = new Forecast[n];

    for (int i = 0; i < n; i++) {
      forecasts[i] = dataInput(sc);
    }

    List<Forecast> list = Arrays.stream(forecasts)
        .sorted(Comparator.comparing(forecast -> forecast.date))
        .filter(forecast -> forecast.weather.equals("Rain"))
        .collect(Collectors.toList());

    Forecast earlyRainyDay = list.get(0);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    System.out.printf("%s %s %s", dateFormat.format(earlyRainyDay.date), earlyRainyDay.day, earlyRainyDay.weather);
  }

  public static Forecast dataInput(Scanner sc) {
    return new Forecast(Date.valueOf(sc.next()), sc.next(), sc.next());
  }
}