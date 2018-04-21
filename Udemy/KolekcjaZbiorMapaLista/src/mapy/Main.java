package mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main
{

    public static void main(String[] args) {

        TreeMap<Integer, Pracownik> mapa = new TreeMap<>(); //TreeMap

        Pracownik[] pracownicy =
                {
                        new Pracownik("Agnieszka"),
                        new Pracownik("Ewa"),
                        new Pracownik("Krzysztof"),
                        new Pracownik("Tomek"),
                        new Pracownik("Agnieszka"),
                        new Pracownik("Ewa"),
                        new Pracownik("Krzysztof"),
                        new Pracownik("Tomek"),
                        new Pracownik("Agnieszka"),
                        new Pracownik("Ewa"),
                        new Pracownik("Krzysztof"),
                        new Pracownik("Tomek"),
                        new Pracownik("Agnieszka"),
                        new Pracownik("Ewa"),
                        new Pracownik("Krzysztof"),
                        new Pracownik("Tomek"),
                        new Pracownik("Agnieszka"),
                        new Pracownik("Ewa"),
                        new Pracownik("Krzysztof"),
                        new Pracownik("Tomek"),

                };

                for (Pracownik pracownik : pracownicy)
                    mapa.put(pracownik.getID(), pracownik);
    }

}

class Pracownik
        {
            public Pracownik()
            {
                i++;
                ID = i;
            }
          public Pracownik (String imie)
          {

              this();
              this.imie = imie;

          }
          public int getID()
          {

              return ID;
          }
          public String getImie(){

                return imie;
          }

            @Override
            public String toString() {
                return imie;
            }
            String imie;
            private int ID;
            public static int i = 0;

        }






