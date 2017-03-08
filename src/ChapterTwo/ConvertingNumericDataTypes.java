package ChapterTwo;

public class ConvertingNumericDataTypes {

    public static void main(String[] args) {

        byte byteVariable1 = 2;
        byte byteVariable2 = 2;
        int byteVariable3;

        byte byteVariable4 = 2;
        byteVariable4 += byteVariable1; // robi cast (byte)

        byteVariable3 = byteVariable1 * byteVariable2;

        short shortVariable1 = 2;
        short shortVariable2 = 2;
        int shortVariable3;

        shortVariable3 = shortVariable1 * shortVariable2;

        int intVariable1 = 2;
        int intVariable2 = 2;
        int intVariable3;

        intVariable3 = intVariable1 * intVariable2;

        long longVariable1 = 2;
        long longVariable2 = 2;
        long longVariable3 = 2;

        longVariable3 = longVariable1 * longVariable2;

        float floatVariable1 = 2;
        float floatVariable2 = 2.0f;
        float floatVariable3 = 2;

        floatVariable3 = floatVariable1 * floatVariable2;

        double doubleVariable1 = 2;
        double doubleVariable2 = 2;
        double doubleVariable3 = 2;

        doubleVariable1 = doubleVariable1 * doubleVariable2;

    }
}
