import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deputats Kluchko = new Deputats(110,190,"Kluchko","Vitalii",59,false,40);
        Deputats Porox = new Deputats(47,160,"Poroshenko","Petro",65,false,60);
        Deputats Yacenyuk = new Deputats(90,181,"Yacenuk","dibil",62,true,70);
        Deputats Lyashko = new Deputats(87,185,"Lyashko","Oleg",44,true,77);
        Deputats Gontareva = new Deputats(55,160,"Gontareva","sychka",41,true,22);
        Deputats AnotherDeputat = new Deputats(70,1808,"Another","Another",88,false,12);
        Deputats Yanukovich = new Deputats(40,180,"Yanukovich","Volodimir",60,true,10);

        ArrayList<Deputats> yebki = new ArrayList<>();
        yebki.add(Porox);
        yebki.add(Kluchko);
        yebki.add(Yanukovich);
        yebki.add(Yacenyuk);
        yebki.add(Lyashko);
        yebki.add(Gontareva);
        yebki.add(AnotherDeputat);

//        Yanukovich.GivHabar();
//        Porox.GivHabar();
//        Kluchko.GivHabar();

//        System.out.println(Yanukovich);
//        System.out.println(Porox);
//        System.out.println(Kluchko);

        Fraction fraction1 = new Fraction(yebki);
//        System.out.println(fraction1);



        ArrayList<Deputats> yebki2 = new ArrayList<>();

        Deputats Kluchko2 = new Deputats(110,190,"Kluchko2","Vitalii",59,false,40);
        Deputats Porox2 = new Deputats(47,160,"Poroshenko2","Petro",65,false,60);
        Deputats Yacenyuk2 = new Deputats(90,181,"Yacenuk2","dibil",62,true,70);
        Deputats Lyashko2 = new Deputats(87,185,"Lyashko2","Oleg",44,true,77);
        Deputats Gontareva2 = new Deputats(55,160,"Gontareva2","sychka",41,true,22);
        Deputats AnotherDeputat2 = new Deputats(70,1808,"Another2","Another",88,false,12);
        Deputats Yanukovich2 = new Deputats(40,180,"Yanukovich2","Volodimir",60,true,10);

        yebki2.add(Porox2);
        yebki2.add(Kluchko2);
        yebki2.add(Yanukovich2);
        yebki2.add(Yacenyuk2);
        yebki2.add(Lyashko2);
        yebki2.add(Gontareva2);
        yebki2.add(AnotherDeputat2);


//        Yanukovich.GivHabar();
//        Porox.GivHabar();
//        Kluchko.GivHabar();
//
//        System.out.println(Yanukovich);
//        System.out.println(Porox);
//        System.out.println(Kluchko);

        Fraction fraction2 = new Fraction(yebki2);
//        System.out.println(fraction2);



//dobavit deputata v fraction
//        fraction1.AddDeputat(50,180,"Lyashko", "oleg",55,true,20000);
//        System.out.println(fraction1);

//ydalit deputata iz fracton
//        int indeks = 2;
//        fraction1.RemuvDeputat(indeks);
//        System.out.println(fraction1);
//udalit vsex xabarnikiv
//        fraction1.RemuvAllXabar();
//        System.out.println(fraction1);

//naibolshego xabarnika
//        fraction1.MaxXabar();

//udalit vsex
//        fraction1.RemuvAll();
//        System.out.println(fraction1);

//summa habarya
//        fraction1.Summa();

        Map<String,Fraction> spisok = new LinkedHashMap<>();
        spisok.put("firstfraction",fraction1);
        spisok.put("secondfraction",fraction2);


//dobavit fraction

        Vr vr = new Vr((LinkedHashMap) spisok);
        Fraction fractionnew = new Fraction(yebki);
        vr.AddFraction(fractionnew);
        System.out.println(vr);

//edalit deputata s fraction
        vr.RemuvDeputatFraction();
        System.out.println(vr);
    }
}
