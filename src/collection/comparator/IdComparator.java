package collection.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getId()- o2.getId();
    }
}
