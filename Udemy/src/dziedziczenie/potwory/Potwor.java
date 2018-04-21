package dziedziczenie.potwory;

public class Potwor {

     public double predkoscChodzenia;
     public double zywotnosc;
     String typBroni;

     public void atakuj ()
    {


        System.out.println("To jest metoda atakuj z klasy Potwor");
    }

    public Potwor()
    {

    }
    public Potwor(double predkoscCodzenia, double zywotnosc, String typBroni)
    {
        this.predkoscChodzenia = predkoscCodzenia;
        this.zywotnosc = zywotnosc;
        this.typBroni = typBroni;

    }
}
