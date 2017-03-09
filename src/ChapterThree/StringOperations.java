package ChapterThree;

/**
 * Created by Michal on 09.03.2017.
 */
public class StringOperations {

    public static void main(String[] args) {

        String textN1 = "text";
        String textN2 = "text";
        String textN3 = " text".trim();
        System.out.println("b" + textN3);

        String textO1 = "text";
        String textO2 = "text";
        String textO3 = " text".trim();
        System.out.println("b" + textO3);

        StringBuilder textSB1 = new StringBuilder("text");
        StringBuilder textSB2 = new StringBuilder("text");
        StringBuilder textSB3 = new StringBuilder(" text".trim());
        System.out.println("b" + textSB3);

        System.out.println(textN1 == "text"); //true
        System.out.println(textN3 == "text"); //false
        System.out.println(textO1 == "text"); //true
        System.out.println(textO3 == "text"); //false
        //System.out.println(textSB1=="text");
        //System.out.println(textSB3=="text");

        System.out.println("----------------------------");

        System.out.println(textN1 == textN2); //true
        System.out.println(textN1 == textN3); //false
        System.out.println(textO1 == textO2); //true
        System.out.println(textO1 == textO3); //false
        System.out.println(textSB1 == textSB2); //false
        System.out.println(textSB1 == textSB3); //false

        System.out.println("----------------------------2");

        System.out.println(textN1 == textO1); //true
        //System.out.println(textN1==textSB1);
        //System.out.println(textO1==textSB1);
        System.out.println(textN1 == textO3); //false
        System.out.println(textN3 == textO1); //false
        System.out.println(textN3 == textO3); //false

        System.out.println("----------------------------");

        System.out.println(textN1.equals("text")); //true
        System.out.println(textN3.equals("text")); //true
        System.out.println(textO1.equals("text")); //true
        System.out.println(textO3.equals("text")); //true
        System.out.println(textSB1.equals("text")); //false
        System.out.println(textSB3.equals("text")); //false
        System.out.println(textN1.equals(textN3)); //true
        System.out.println(textN1.equals(textO1)); //true
        System.out.println(textN1.equals(textO3)); //true
        System.out.println(textN1.equals(textSB1)); //false
        System.out.println(textN1.equals(textSB3)); //false
        System.out.println(textSB1.equals(textSB2)); //false
        System.out.println(textSB1.equals(textSB3)); //false


        String text = "1";
        String text2 = String.valueOf(2);
        text2 = 2 + "";
        text += "b";
        text += 3;

        String test1 = "test";
        String test12 = "test";
        String test2 = "   test".trim();


        String testO = new String("test");

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


    }
}
