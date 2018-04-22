/*package butelka;

public class Butelka {
    private double ileLitrow;

    public Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }

    public Butelka() {

    }

    public double getIleLitrow()
    {
        return ileLitrow;
    }

    public void wlej(pojemnosc) {
        wlej();
    }

    public void wlej(double ilosc, pojemnosc)
    {
        this.ileLitrow += ilosc;
    }
    boolean wylej(double ilosc)
    {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelac)
    {
        if (this.wylej(ilosc))
        {
            Butelka[] butelka = new Butelka[0];
            gdziePrzelac.wlej(ilosc, butelka[0].getPojemnosc());
        }
        else
            System.out.println("Za mało");
    }


    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3]; //NULL

        butelka[0] = new Butelka(5);
        butelka[1] = new Butelka(8);
        butelka[2] = new Butelka(10);

        butelka[0].wlej(4, butelka[0].getPojemnosc());

        butelka[0].przelej(25, butelka[1]);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());

    }

    public void setIleLitrow(int i) {

    }

    public void setPojemnosc(int i) {

    }

    public void getPojemnosc() {



    }

    public double wlej(double ilosc, double maxPojemnosc) {
        return 0;
    }

    public void przelej(int i, Butelka butelka, void pojemnosc) {

    }
}


*/






