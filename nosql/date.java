package nosql;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by 羊 on 2019/6/16.
 */
public class date {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2019, 6, 1);
        System.out.println(c);
        int day_of_week = c.get(Calendar. DAY_OF_WEEK);
        System.out.println(day_of_week);
    }
}
