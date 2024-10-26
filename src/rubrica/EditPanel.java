package rubrica;

import javax.swing.*;

public class EditPanel extends JPanel {
    JLabel surnameLabel;
    JLabel nameLabel;
    JLabel phoneNumberLabel;
    JLabel emailLabel;

    JTextField surnameTextField;
    JTextField nameTextField;
    JTextField phoneNumberTextField;
    JTextField emailTextField;

    public EditPanel(Contacts main) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(surnameLabel = new JLabel("Surname"));
        add(surnameTextField = new JTextField(20));
        add(nameLabel = new JLabel("Name"));
        add(nameTextField = new JTextField(20));
        add(phoneNumberLabel = new JLabel("Phone Number"));
        add(phoneNumberTextField = new JTextField(20));
        add(emailLabel = new JLabel("Email"));
        add(emailTextField = new JTextField(20));
    }
}
