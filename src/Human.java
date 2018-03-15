/**
 * Created by okten29 on 2/23/18.
 */
public class Human {
    public int Vaga;
    public int Rist;

    public Human() {
    }

    public Human(int vaga, int rist) {
        Vaga = vaga;
        Rist = rist;
    }

    public int getVaga() {
        return Vaga;
    }

    public void setVaga(int vaga) {
        Vaga = vaga;
    }

    public int getRist() {
        return Rist;
    }

    public void setRist(int rist) {
        Rist = rist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (Vaga != human.Vaga) return false;
        return Rist == human.Rist;
    }

    @Override
    public int hashCode() {
        int result = Vaga;
        result = 31 * result + Rist;
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Vaga=" + Vaga +
                ", Rist=" + Rist +
                '}';
    }
}
