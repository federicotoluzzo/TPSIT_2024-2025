package rubrica;

import javax.swing.*;
import java.awt.*;

public class Contacts extends JFrame {

    public static void main(String[] args) {
        Contacts c = new Contacts();
    }

    public Contacts() {
        super("Contacts");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        getContentPane().add(new MainPanel(this));
        getContentPane().add(new ButtonMenu(this));

        pack();

        setVisible(true);
    }
}
