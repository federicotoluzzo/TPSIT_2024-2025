package rubrica;

import javax.swing.*;

public class SearchBar extends JPanel {
    private JTextField textField;
    private JButton button;

    public SearchBar() {
        textField = new JTextField();
        button = new JButton(new ImageIcon("./assets/magnifying-glass.png"));
    }
}
