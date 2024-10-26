package rubrica;

import javax.swing.*;
import java.awt.*;

public class Contact extends JPanel {
    private String surname;
    private String name;
    private String phoneNumber;
    private String email;

    private JLabel surnameLabel;
    private JLabel nameLabel;
    private JLabel phoneNumberLabel;
    private JLabel emailLabel;

    public Contact(String surname, String name, String phoneNumber, String email) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

        surnameLabel = new JLabel(surname);
        nameLabel = new JLabel(name);

        surnameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));

        phoneNumberLabel = new JLabel(phoneNumber);
        emailLabel = new JLabel(email);
        phoneNumberLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        phoneNumberLabel.setForeground(Color.DARK_GRAY);
        emailLabel.setForeground(Color.DARK_GRAY);
    }
}
