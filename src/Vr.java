import java.util.*;
import java.util.Map.Entry;

public class Vr {
    public LinkedHashMap<String,Fraction> spisok;

    public Vr() {
    }

    public Vr(LinkedHashMap spisok) {
        this.spisok = spisok;
    }

    public void AddFraction(Fraction fractionnew){
        this.spisok.put("thirdfraction",fractionnew);
    }

    public void RemuvDeputatFraction(){
        Set<Entry<String, Fraction>> entries = this.spisok.entrySet();
        Iterator<Entry<String, Fraction>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<String, Fraction> next = iterator.next();
            Fraction value = next.getValue();
            value.RemuvDeputat(0);
        }
    }

    public LinkedHashMap getSpisok() {
        return spisok;
    }

    public void setSpisok(LinkedHashMap spisok) {
        this.spisok = spisok;
    }

    @Override
    public String toString() {
        return "Vr{" +
                "spisok=" + spisok +
                '}';
    }
}
