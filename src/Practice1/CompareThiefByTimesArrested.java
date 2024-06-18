package Practice1;

import java.util.Comparator;

public class CompareThiefByTimesArrested implements Comparator<Thief> {
    @Override
    public int compare(Thief o1, Thief o2) {
        if (o1.getTimesArrested() < o2.getTimesArrested()) return -1;
        else if (o1.getTimesArrested() > o2.getTimesArrested())return 1;
        else return 0;
    }
}
