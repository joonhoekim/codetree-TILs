import java.util.*;

class Date{
    static final int[] numOfMonthReap = new int[]{0, 31, 29, 31, 30, 31 ,30, 31, 31, 30, 31, 30, 31};
    static final String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int month;
    int day;

    Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getDays() {
        int sum = this.day;
        for(int i=1; i<this.month; i++) {
            sum += numOfMonthReap[i];
        }
        return sum;
    }

    public int getDayDiff(Date date) {
        return date.getDays() - this.getDays();
    }

    public int countWeek(Date date) {
        int diff = getDayDiff(date);
        return diff/7;
    }

    public static int getNameOfDayIdx(String nameOfDay) {
        for(int i=0; i<days.length; i++) {
            if (days[i].equals(nameOfDay)) {
                return i;
            }
        }
        return -1;
    }

    //int year; int hour; int minute; int second;
    //isReap() ...

    //계산로직...
    //1. 일주일 단위(/7)는 1번씩 카운트한다. 
    //2. 남은 날짜(%7)가 요일 인덱스 이하인 경우라면 1번을 추가한다.
    public int countNameOfDay(Date date, String nameOfDay) {
        int sum = this.countWeek(date);
        if(this.getDayDiff(date)%7 >= getNameOfDayIdx(nameOfDay)) {
            sum++;
        }
        return sum;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d1 = new Date(sc.nextInt(), sc.nextInt());
        Date d2 = new Date(sc.nextInt(), sc.nextInt());
        System.out.println(d1.countNameOfDay(d2, sc.next()));
    }
}