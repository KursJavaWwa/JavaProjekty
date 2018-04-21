public class Metody {

    public static void main(String[] args) {

        /*
        Obiekty - to pojemniki do przechowywania zmiennych i funkcji tematycznie
                      ze sobą powiązanych do dalszego łatwiejszego ponownego użycia
            Klasy -   foremki do tworzenia egzemplarzy obiektów

            Properties - właściwości
            Metody - funkcje (opisują czynności związane z obiektem)

         */


        Test a = new Test();

        a.wypiszGodnosc("Krzysztof", "Kaczyński");

        Test a2 = new Test();

        a2.wypiszGodnosc("Ewa", "Kaczyńska");

    }

}

class Test
{
    void wypiszGodnosc(String imie, String nazwisko)
    {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println();
    }
}