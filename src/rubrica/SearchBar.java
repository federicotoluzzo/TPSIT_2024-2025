package rubrica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SearchBar extends JPanel {
    private JTextField textField;
    private JButton button;

    public SearchBar(Contacts main) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        textField = new JTextField(20);
        Image searchIcon = new ImageIcon("magnifying-glass.png").getImage();
        button = new JButton(new ImageIcon(searchIcon.getScaledInstance(16,16,0)));

        button.addActionListener(e -> {
            main.searchContact(textField.getText());
        });


        add(textField);
        add(button);
    }
}
