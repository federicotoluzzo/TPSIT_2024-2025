package rubrica;

import javax.swing.*;
import java.awt.*;

public class ButtonMenu extends JPanel {
    private JButton load;
    private JButton saveAll;
    private JButton clear;
    private JButton saveContact;
    private JButton remove;

    public ButtonMenu(Contacts main) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        load = new JButton("Load");
        saveAll = new JButton("Save to File");
        clear = new JButton("Clear");
        saveContact = new JButton("Save Contact");
        remove = new JButton("Remove");

        add(load);
        add(saveAll);
        add(clear);
        add(saveContact);
        add(remove);
    }
}
