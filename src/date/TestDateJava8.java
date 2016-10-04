package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * Created by serhii on 9/10/16.
 */
public class TestDateJava8 {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1990, 10, 05);
        LocalDate localDate2 = LocalDate.now();
        localDate1.get(ChronoField.DAY_OF_MONTH);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate1.get(ChronoField.DAY_OF_MONTH));

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Получаем текущее время : " + today);
        //our pattern
        System.out.println(today.format(DateTimeFormatter.ofPattern("d MMMM uuuu H-m-s")));


        LocalDate date = LocalDate.now();
        // стандартный формат даты
        System.out.println("стандартный формат даты для LocalDate : " + date);
        // приименяем свой формат даты
        System.out.println(date.format(DateTimeFormatter.ofPattern("d MMMM uuuu")));

    }
}
