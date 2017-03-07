package chapterOne;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Michal on 07.03.2017.
 */
public class Finalizer {
    private static List objects = new ArrayList();

    protected void finalize() {
        objects.add(this);  // Don't do this  }
    }
}