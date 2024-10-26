package rubrica;

import javax.swing.*;
import java.awt.*;

public class SearchBar extends JPanel {
    private JTextField textField;
    private JButton button;

    public SearchBar() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        textField = new JTextField(20);
        Image searchIcon = new ImageIcon("./assets/magnifying-glass.png").getImage();
        button = new JButton(new ImageIcon(searchIcon.getScaledInstance(16,16,0)));

        add(textField);
        add(button);
    }
}
