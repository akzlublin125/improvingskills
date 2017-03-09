package ChapterFour;

public class StaticFinal {
    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four;

    static {
        one = 1;
        one = 2;
        two = 2;
        //  two = 4;
        //  three = 3;
    }

    public static void main(String[] args) {
    }
}
