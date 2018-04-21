/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;


public class Szkielet extends Potwor
{
    @Override
    public void atakuj()
    {
        super.atakuj();
        /*
            DODATKOWE INSTRUKCJE ATAKUJACE :P
        */
        
        System.out.println("To jest metoda atakuj z klasy Szkielet");
        
    }
    String typBroni;
    public Szkielet()
    {
        System.out.println("Domyślny konstruktor z klasy Szkielet");
        
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc)
    {        
        super(predkoscChodzenia, zywotnosc);
        System.out.println("Niedomyślny konstruktor z klasy Szkielet z dwoma argumentami");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
    {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("NieDomyślny konstruktor z klasy Szkielet");
       
    }
}
