package rubrica;

import javax.swing.*;

public class Contacts extends JFrame {

    public static void main(String[] args) {
        Contacts c = new Contacts();
    }

    public Contacts() {
        super("Contacts");

        add(new SearchPanel());
        add(new ButtonMenu(this));

        pack();

        setVisible(true);
    }
}
