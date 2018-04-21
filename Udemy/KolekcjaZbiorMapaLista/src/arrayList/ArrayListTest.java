package arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {


        ArrayList<Personel> pracownik = new ArrayList<Personel>();

        pracownik.add(new Personel("Krzysztof", "Kaczyński", 7500, 1970, 11, 19));
        pracownik.add(new Personel("Ewa", "Kaczyński", 9500, 1970, 12, 27));
        pracownik.add(new Personel("Paweł", "Kaczyński", 5500, 1993, 03, 01));

            for (Personel nowy : pracownik);
            Personel nowy;
        nowy = new Personel("","" ,0 ,0 ,0 ,0 );
        System.out.println(nowy);



    }

}

class Personel <T> {

    Personel(String imie, String nazwisko, double zarobki, int rok, int miesiąc, int dzień) {


    }
}
class pracownik extends Personel
{

    pracownik(String imie, String nazwisko, double zarobki, int rok, int miesiąc, int dzień) {
        super(imie, nazwisko, zarobki, rok, miesiąc, dzień);
    }
}
