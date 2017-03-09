package ChapterThree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 09.03.2017.
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("da");
        list.add(true);
        list.add(212);
        byte b = 123;
        list.add(b);

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(b);

        String[] arrayString = {"hawk", "robin"};
        List<String> list10 = java.util.Arrays.asList(arrayString);
        list10.add("bleble");  //generuje error - bo po konwersji z tablicy na liste, lista jest fixed size

        //        ArrayList<Long> list3 = new ArrayList<>();
//        list3.add(n);
//        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(b);

    }
}
