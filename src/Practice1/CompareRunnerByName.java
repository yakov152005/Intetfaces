package Practice1;
import java.util.Comparator;
public class CompareRunnerByName implements Comparator<Runner> {

    @Override
    public int compare(Runner o1, Runner o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
