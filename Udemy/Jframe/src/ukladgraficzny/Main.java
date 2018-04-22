package ukladgraficzny;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {

        super("Układ graficzne (Layout)");
        this.setBounds(300, 320, 300, 200);


        this.setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

