package rubrica;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class Contact extends JPanel {
    private String surname;
    private String name;
    private String phoneNumber;
    private String email;

    private JLabel nameLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;

    public Contact(Contacts main, String surname, String name, String phoneNumber, String email) {
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

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(nameLabel);
        add(phoneNumberLabel);
        add(emailLabel);

        setBorder(BorderFactory.createRaisedBevelBorder());

        addMouseListener(new DoubleClickListener(() -> System.out.println("ciao")));
    }
}
