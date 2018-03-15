import java.util.Comparator;

public class ComparatorDeputat implements Comparator<Deputats> {
    @Override
    public int compare(Deputats o1, Deputats o2) {
        return o1.RozmirHabara - o2.RozmirHabara;
    }
}
