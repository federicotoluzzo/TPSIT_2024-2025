package calculator;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Display extends JPanel {
    public JLabel equation;
    public JTextField result;

    public Display() {
        equation = new JLabel("");
        result = new JTextField("");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(equation);
        add(result);


    }

    public void write(char c){
        result.setText(result.getText() + c);
    }
}
