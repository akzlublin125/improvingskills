package ChapterTwo;

/**
 * Created by Michal on 08.03.2017.
 */
public class Labels {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }
    }
}