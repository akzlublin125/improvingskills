package ChapterTwo;

/**
 * Created by Michal on 08.03.2017.
 */
public class ForLoop {
    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);

        for (byte y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);

//        for (byte y = 0, byte z = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(y + " ");
//        }

//        x = 0;
//        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {   // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }


    }
}
