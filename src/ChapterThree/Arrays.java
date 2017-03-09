package ChapterThree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 09.03.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(array);
        System.out.println(array2);

        List<String> listString = new ArrayList<>();
        listString.add("hawk");
        listString.add("robin");
        Object[] objectArray = listString.toArray();
        System.out.println("size " + objectArray.length);
        String[] stringArray = listString.toArray(new String[0]);
        System.out.println(stringArray.length);
    }
}
