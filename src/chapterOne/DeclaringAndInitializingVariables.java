package chapterOne;

public class DeclaringAndInitializingVariables {

    boolean zmiennaBoolean;
    byte zmiennaByte;
    short zmiennaShort;
    int zmiennaInt;
    long zmiennaLong;
    float zmiennaFloat;
    double zmiennaDouble;
    char zmiennaChar;

    public static void main(String[] args) {
        int i1, i2, i3 = 5;
        int i4;
        int i5;
        //not compile
        //int num, String value;
        //double d1, double d2;

        int $zmienna;
        int _zmienna;
        int zmie1nna1;

        //not compile
        //int .$zmienna;
        //int _zmi@enna;
        //int 1zmie1nna1;


        //Have to initialize localVariable before println - because flag could be false
//        boolean flag = true;
//        int localVariable;
//
//        if(flag){
//            localVariable = 5;
//        }
//        System.out.println(localVariable);

        DeclaringAndInitializingVariables declaringAndInitializingVariables = new DeclaringAndInitializingVariables();
        System.out.println("boolean = " + declaringAndInitializingVariables.zmiennaBoolean);
        System.out.println("byte = " + declaringAndInitializingVariables.zmiennaByte);
        System.out.println("short = " + declaringAndInitializingVariables.zmiennaShort);
        System.out.println("int = " + declaringAndInitializingVariables.zmiennaInt);
        System.out.println("long = " + declaringAndInitializingVariables.zmiennaLong);
        System.out.println("float = " + declaringAndInitializingVariables.zmiennaFloat);
        System.out.println("double = " + declaringAndInitializingVariables.zmiennaDouble);
        System.out.println("char = " + declaringAndInitializingVariables.zmiennaChar);


    }
}
