package ChapterFour;

public class Varargs {

    protected int protectedVariable = 2;
    int defaultVariable = 3;
    int privateVariable = 4;


    public void walk1(int... nums) {
    }

    public void walk2(int start, int... nums) {
    }

    //not compile
//    public void walk3(int... nums, int start) {
//    }
//
//    public void walk4(int... start, int... nums) {
//    }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.walk1(1, 2);
        //varargs.walk1(1,null);
    }
}

class InFile {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        System.out.println(varargs.protectedVariable);
        System.out.println(varargs.defaultVariable);
        System.out.println(varargs.privateVariable);
    }
}
