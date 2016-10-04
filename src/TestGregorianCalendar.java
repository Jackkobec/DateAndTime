import sun.util.calendar.LocalGregorianCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * TestGregorianCalendar
 */
public class TestGregorianCalendar {
    public static void main(String[] args) {
        System.out.println(new GregorianCalendar().getTime());
        String currentTime = new GregorianCalendar().getTime().toString();
        System.out.println(currentTime);
        System.out.println("=========================");

        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getMonth());


    }
}
