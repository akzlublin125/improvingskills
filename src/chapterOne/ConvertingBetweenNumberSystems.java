package chapterOne;

/**
 * Created by Michal on 07.03.2017.
 */
public class ConvertingBetweenNumberSystems {
    public static void main(String[] args) {
        //base 10
        System.out.println(56);       // 56
        //binary
        System.out.println(0b11);     // 3
        //octal
        System.out.println(017);      // 15
        //hexadecimal
        System.out.println(0x1F);     // 31

        int number;

        number = 1_000_000;
        number = 1_000__000;

        //not compile
        //number = _1_000_000;
        //number = 1_000_000_;
        //number = 1_000_.000;
        //number = 1_000._000;
        //number = null


    }
}
