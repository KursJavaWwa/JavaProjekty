package greetMsg;
import javax.swing.JOptionPane;

public class GreetMsg {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog( "Podaj swoje imię" );
        if (name == null) name = "";
        JOptionPane.showMessageDialog(null, "Witaj " + name + "!");

    }





}
