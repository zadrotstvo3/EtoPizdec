/**
 * Created by okten29 on 2/23/18.
 */
public class Deputats extends Human {
    public String SecondName;
    public String Name;
    public int Age;
    public boolean Habar;
    public int RozmirHabara;

    public Deputats() {

    }

    public Deputats(int vaga, int rist, String secondName, String name, int age, boolean habar, int rozmirHabara) {
        super(vaga, rist);
        SecondName = secondName;
        Name = name;
        Age = age;
        Habar = habar;
        RozmirHabara = rozmirHabara;
    }

    public void GivHabar(){
        if(this.Habar == true){
            System.out.println("Give me habar");
        }else if(this.Habar == false & this.RozmirHabara > 50){
            System.out.println("Vagatusya");
        }else if (this.Habar == false){
            System.out.println("Vidmovutusya");
        }
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isHabar() {
        return Habar;
    }

    public void setHabar(boolean habar) {
        Habar = habar;
    }

    public int getRozmirHabara() {
        return RozmirHabara;
    }

    public void setRozmirHabara(int rozmirHabara) {
        RozmirHabara = rozmirHabara;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Deputats deputats = (Deputats) o;

        if (Age != deputats.Age) return false;
        if (Habar != deputats.Habar) return false;
        if (RozmirHabara != deputats.RozmirHabara) return false;
        if (SecondName != null ? !SecondName.equals(deputats.SecondName) : deputats.SecondName != null) return false;
        return Name != null ? Name.equals(deputats.Name) : deputats.Name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (SecondName != null ? SecondName.hashCode() : 0);
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + Age;
        result = 31 * result + (Habar ? 1 : 0);
        result = 31 * result + RozmirHabara;
        return result;
    }

    @Override
    public String toString() {
        return "Deputats{" +
                "Vaga=" + Vaga +
                ", SecondName='" + SecondName + '\'' +
                ", Rist=" + Rist +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Habar=" + Habar +
                ", RozmirHabara=" + RozmirHabara +
                '}';
    }
}
