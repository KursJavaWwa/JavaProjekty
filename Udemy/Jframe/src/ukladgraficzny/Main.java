/*package ukladgraficzny;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        super("Układ graficzne (Layout)");
        this.setBounds(300, 320, 300, 200);

        initComponents();
        this.pack();
        this.setDefaultCloseOperation(3);

    }

    public void initComponents() {

        centrum = new JButton("Centrum!");
        gora = new JButton("GÓra!");
        dol = new JButton("Dół!");
        prawa = new JButton("Prawa!");
        lewa = new JButton("Lewa!");

        Container kontener = this.getContentPane();

        kontener.add(centrum, BorderLayout.CENTER);
        kontener.add(gora, BorderLayout.PAGE_START);
        kontener.add(dol, BorderLayout.PAGE_END);
        kontener.add(prawa, BorderLayout.LINE_END);
        kontener.add(lewa, BorderLayout.LINE_START);


    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;


    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
*/
