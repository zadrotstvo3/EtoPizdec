import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by okten29 on 2/23/18.
 */
public class Fraction {
    public ArrayList<Deputats> yebki;

    public Fraction() {
    }

    public Fraction(ArrayList<Deputats> yebki) {
        this.yebki = yebki;
    }

    public void AddDeputat(int vaga, int rist, String secondname, String name, int age, boolean habar, int rozmirHabara) {
        Deputats newDeputat = new Deputats(vaga, rist, secondname, name, age, habar, rozmirHabara);
        this.yebki.add(newDeputat);
    }

    public void RemuvDeputat(int index) {
        this.yebki.remove(index);
    }

    public void RemuvAllXabar() {
        Iterator<Deputats> iterator = this.yebki.iterator();
        while (iterator.hasNext()) {
            Deputats next = iterator.next();
            if (next.Habar == true) {
                iterator.remove();
            }
        }
    }

    public void MaxXabar() {
        ComparatorDeputat comparatorDeputat = new ComparatorDeputat();
        this.yebki.sort(comparatorDeputat);
        Deputats BosXabar = this.yebki.get(this.yebki.size() - 1);
        System.out.println(BosXabar);
    }

    public void RemuvAll() {
        this.yebki.clear();
    }

    public void Summa() {
        Iterator<Deputats> iterator = this.yebki.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Deputats next = iterator.next();
            sum = sum + next.RozmirHabara;
        }
        System.out.println(sum);
    }

    public ArrayList getYebki() {
        return yebki;
    }

    public void setYebki(ArrayList yebki) {
        this.yebki = yebki;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "yebki=" + yebki +
                '}';
    }
}
