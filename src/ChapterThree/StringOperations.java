package ChapterThree;

/**
 * Created by Michal on 09.03.2017.
 */
public class StringOperations {

    public static void main(String[] args) {

        String text = "1";
        String text2 = String.valueOf(2);
        text2 = 2 + "";
        text += "b";
        text += 3;

        String test1 = "test";
        String test12 = "test";
        String test2 = "   test".trim();


        String testO = new String("test");

        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(testO));
        System.out.println(test1.equals(test12));
        System.out.println(test2.equals(testO));
        System.out.println(test1==test2);
        System.out.println(test1==test12);
        System.out.println(test1==testO);
        System.out.println(test2==testO);

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        StringBuilder stringBuilder = new StringBuilder("abcdefghij");

        stringBuilder.substring(2,5);
        System.out.println(stringBuilder);
        stringBuilder.append("123");
        System.out.println(stringBuilder);
        StringBuilder stringBuilder2 = new StringBuilder("abcdefghij");
        StringBuilder stringBuilder3 = new StringBuilder("abcdefghij");
        System.out.println(stringBuilder2==stringBuilder3);
        System.out.println(stringBuilder2.equals(stringBuilder3));

    }
}
