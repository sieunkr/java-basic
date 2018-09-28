import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Coffee {

    private final Date sinceDate;

    public Coffee(Date sinceDate) {
        this.sinceDate = sinceDate;
    }

    private static final Date NEW_START;
    
    //static 변수를 초기화 하기 위한 static 초기화 블록은 프로그램 시작시 단 한 번 실행
    static{
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2018, Calendar.JANUARY, 1, 0, 0, 0);
        NEW_START = cal.getTime();
    }

    public boolean isNewCoffee(){
        return sinceDate.compareTo(NEW_START) >= 0;
    }

    /* 불필요한 객체는 만들지 마라.
    public boolean isNewCoffee(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(2018, Calendar.JANUARY, 1, 0, 0, 0);
        생략...
    }
    */
}
