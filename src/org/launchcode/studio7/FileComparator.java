package org.launchcode.studio7;
import java.util.Comparator;

import java.util.Comparator;
import java.util.HashMap;

public class FileComparator implements Comparator<HashMap>{

        @Override
        public int compare(Cone o1, Cone o2) {
            if (o1.getCost() - o2.getCost() > 0) {
                return 1;
            }
            if (o1.getCost() - o2.getCost() == 0) {
                return 0;
            } else return -1;
        }
    }
}
