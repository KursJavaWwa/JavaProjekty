/*package butelka2;

import butelka.Butelka;

public class Butelka2 {
    Butelka2(double ileLitrow) {

    }

    static int ileButelek = 50;
    private double ileLitrow;
    private double pojemnosc;

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public double getIleLitrow() {
        return ileLitrow;
    }

     {

}
    double wlej(double ilosc, double maxPojemnosc) {
        if (ileLitrow + ilosc <= maxPojemnosc) {
            ileLitrow += ilosc;
            return 0;
        } else {
            double reszta  = ilosc - (maxPojemnosc - ileLitrow);
            ileLitrow = maxPojemnosc;
            System.out.println("Przelano tylko do max pojemnosci - " + maxPojemnosc);
            return reszta;
        }
    }
    boolean wylej(double ilosc) {
        if (ilosc <= ileLitrow) {
            ileLitrow -= ilosc;
            return true;
        } else {
            return false;
        }
    }
    void przelej(double ilosc, Butelka gdziePrzelac, double maxPojemnosc) {
        if (this.wylej(ilosc)) {
            double reszta = gdziePrzelac.wlej(ilosc, maxPojemnosc);
            if (reszta != 0) {
                this.wlej(reszta, this.getPojemnosc());
            }
        } else {
            System.out.println("za dużo do przelania");
        }
    }
    public void setIleLitrow(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }
    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[ileButelek];
        for (int i = 0; i < ileButelek; i++) {
            butelka[i] = new Butelka();
        }
        butelka[0].setIleLitrow(5);
        butelka[0].setPojemnosc(100);
        butelka[1].setIleLitrow(1);
        butelka[1].setPojemnosc(50);
        System.out.println("START Butelka0: " + butelka[0].getIleLitrow());
        System.out.println("START Butelka1: " + butelka[1].getIleLitrow());
        System.out.println("--------------------------------");

        butelka[0].wlej(80, butelka[0].getPojemnosc());
        System.out.println("Butelka0: " + butelka[0].getIleLitrow());

        butelka[0].przelej(70, butelka[1], butelka[1].getPojemnosc());
        System.out.println("Butelka0: " + butelka[0].getIleLitrow());
        System.out.println("Butelka1: " + butelka[1].getIleLitrow());
    }
}

*/
