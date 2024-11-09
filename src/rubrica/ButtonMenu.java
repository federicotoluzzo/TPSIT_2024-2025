package rubrica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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

        saveContact.addActionListener(e -> {
            main.saveContact();
        });

        load.addActionListener(e -> {
            main.loadContacts();
        });

        saveAll.addActionListener(e -> {
            main.saveContacts();
        });

        add(load);
        add(saveAll);
        add(clear);
        add(saveContact);
        add(remove);
    }
}
