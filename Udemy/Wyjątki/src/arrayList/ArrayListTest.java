package arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {


        ArrayList<Personel> pracownik = new ArrayList<Personel>();

        pracownik.add(new Personel("Krzysztof", "Kaczyński", 7500, 1970, 11, 19));
        pracownik.add(new Personel("Ewa", "Kaczyński", 9500, 1970, 12, 27));
        pracownik.add(new Personel("Paweł", "Kaczyński", 5500, 1993, 03, 01));

        System.out.println(pracownik.size());
        System.out.println(pracownik);

    }

}

class Personel {

    Personel(String imie, String nazwisko, double zarobki, int rok, int miesiąc, int dzień) {


    }
}
class pracownik extends Personel
{

    pracownik(String imie, String nazwisko, double zarobki, int rok, int miesiąc, int dzień) {
        super(imie, nazwisko, zarobki, rok, miesiąc, dzień);
    }
}