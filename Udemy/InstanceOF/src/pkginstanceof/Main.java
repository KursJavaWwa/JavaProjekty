package pkginstanceof;

public class Main {

    public void main(String[] args)
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Krzysztof", "Kaczyński",5000);
        osoba[1] = new Student("Ewa", "Kaczyńska");
        System.out.println();
    }



abstract class Osoba
{
        String imie;
        String nazwisko;

        Osoba(String imie, String nazwisko)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }
        abstract void pobierzOpis();
}
     class Pracownik extends Osoba
    {
       Pracownik(String imie, String nazwisko, double wynagrodzenie){
           super(imie, nazwisko);
           this.wynagrodzenie = wynagrodzenie;
       }
        double wynagrodzenie;

        @Override
        void pobierzOpis() {

        }
    }
     class Student extends Osoba{

        Student(String imie, String nazwisko){
            super(imie, nazwisko);

        }

         @Override
         void pobierzOpis() {

         }
     }

}
