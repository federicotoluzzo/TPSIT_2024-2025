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

    Contacts main;

    public EditPanel(Contacts main) {
        this.main = main;

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

    public Contact getContact(){
        String surname = surnameTextField.getText();
        String name = nameTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String email = emailTextField.getText();

        return new Contact(main, surname, name, phoneNumber, email);
    }

    public void setContact(Contact contact){
        surnameTextField.setText(contact.surname);
        nameTextField.setText(contact.name);
        phoneNumberTextField.setText(contact.phoneNumber);
        emailTextField.setText(contact.email);
    }
}
