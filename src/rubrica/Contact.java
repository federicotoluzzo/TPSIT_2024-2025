package rubrica;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class Contact extends JPanel {
    public String surname;
    public String name;
    public String phoneNumber;
    public String email;

    private JLabel nameLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;

    private Contacts main;

    public Contact(Contacts main, String surname, String name, String phoneNumber, String email) {
        this.main = main;

        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

        nameLabel = new JLabel(surname + " " + name);

        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));

        phoneNumberLabel = new JLabel(phoneNumber);
        emailLabel = new JLabel(email);
        phoneNumberLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        phoneNumberLabel.setForeground(Color.DARK_GRAY);
        emailLabel.setForeground(Color.DARK_GRAY);

        setLayout(new GridLayout(3, 1));

        add(nameLabel);
        add(phoneNumberLabel);
        add(emailLabel);

        setBorder(BorderFactory.createRaisedBevelBorder());
        setFocusable(true);

        addMouseListener(new DoubleClickListener(() -> setContact(this)));
    }

    public void setContact(Contact contact) {
        main.setContact(contact);
    }
}
