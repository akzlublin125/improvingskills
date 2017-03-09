package ChapterFour.subpackage;

import ChapterFour.Varargs;

/**
 * Created by Michal on 09.03.2017.
 */
public class Subpackage extends Varargs {
    public static void main(String[] args) {
        Subpackage subpackage = new Subpackage();
        //subpackage.protectedVariable;
        System.out.println(subpackage.protectedVariable);
        //System.out.println(subpackage.default..);
    }
}
