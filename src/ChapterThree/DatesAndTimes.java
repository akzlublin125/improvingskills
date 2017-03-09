package ChapterThree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by Michal on 09.03.2017.
 */
public class DatesAndTimes {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        // LocalTime time0 =  LocalTime.of(6);
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 20, 200);

        double year = 1992;
        date1 = date1.plusDays(2);
        //date1 = date1.plusYears(year);

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        // date = date.plusMinutes(1);
    }
}
