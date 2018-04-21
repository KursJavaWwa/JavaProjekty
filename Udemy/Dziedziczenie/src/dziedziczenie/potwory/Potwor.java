/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;

public class Potwor {
    protected double predkoscChodzenia;
    protected double zywotnosc;
    
    public void atakuj()
    {
        /*
            BAZOWE INSTRUKCJE ATAKU
        */
        
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }
    
    public Potwor()
    {
        System.out.println("Domyślny konstruktor z klasy Potwor");
    }
    public Potwor(double predkoscChodzenia, double zywotnosc)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("NieDomyślny konstruktor z klasy Potwor");
    }    
    
}
