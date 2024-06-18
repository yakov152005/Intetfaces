package Practice1;

import java.util.Comparator;

public class CompareThiefByHeight implements Comparator<Thief> {
    @Override
    public int compare(Thief o1, Thief o2) {
        if (o1.getHeight() == o2.getHeight()) return 0;
        else if (o1.getHeight() > o2.getHeight()) return 1;
        else return -1;
    }
}
