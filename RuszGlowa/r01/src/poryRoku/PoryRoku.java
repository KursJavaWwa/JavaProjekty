package poryRoku;

import javax.swing.*;

public class PoryRoku {

    enum Pora { ZIMA, WIOSNA, LATO, JESIEŃ }

    public static String opisz(Pora p){
        if (p == Pora.ZIMA) return p + " - pada śnieg. ";
        if (p == Pora.WIOSNA) return p + " - kwitnie bez. ";
        if (p == Pora.LATO) return p + " - jest ciepło. ";
        if (p == Pora.JESIEŃ) return p + " - pada deszcz. ";
        return "Pora roku nie została wybrana";
    }

    public static void main(String[] args) {

        String nazwa = JOptionPane.showInputDialog("Podaj porę roku:");
        Pora p = Pora.valueOf(nazwa);
        JOptionPane.showMessageDialog(null, opisz(p) );

    }

}

