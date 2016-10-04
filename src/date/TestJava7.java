package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by serhii on 9/10/16.
 */
public class TestJava7 {

    public static void main(String[] args) {
        // JodaTime -> Java 8
        Date date = new Date();
        System.out.println("date.getTime() " + date.getTime());
        System.out.println("date " + date);



        String format = String.format(
                "year %1$ty, month %1$tm, day %1$td, time %1$tH:%1$tM", date);
        System.out.println(format);
        System.out.println("====================");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = simpleDateFormat.parse("1990-7-12");
            System.out.println("date1 " + date1);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("====================");
        Calendar calendar = new GregorianCalendar(1990, 11, 12);

        Date fromCalendar = calendar.getTime();

        System.out.println("fromCalendar " + fromCalendar);
        System.out.println("fromCalendar.getTime() " + fromCalendar.getTime());
        int month = calendar.get(Calendar.MONTH);

        calendar.setTime(date);


    }

}
