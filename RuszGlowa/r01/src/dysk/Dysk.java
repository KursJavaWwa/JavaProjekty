package dysk;

public class Dysk {

    private static double vat;
    private static double cena;

    private String model;
    private int pojemnosc;

    public Dysk(String m, int p, double c){
        model = m;
        pojemnosc = p;
        cena = c;
    }

    public String getOpis() {
        return model + ", " + pojemnosc + "GB";
    }

    public static double getCenaBrutto() {
        return cena * (1 + vat / 100);
        }

    public static void setVat(double v) {
        vat = v;
    }
}



    class Test{

        public static void main(String[] args) {

            Dysk.setVat(22.0);
            Dysk d1 = new Dysk("WD", 500, 200);
            System.out.println(d1.getOpis() + " - cena " + d1.getCenaBrutto() + " zł");

        }
    }