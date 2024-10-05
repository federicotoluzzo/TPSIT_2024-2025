package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Display extends JPanel {
    public JLabel equation;
    public JTextField result;

    public Display() {
        equation = new JLabel("");
        result = new JTextField("");

        equation.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        equation.setForeground(new Color(0x424242));

        result.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        result.setMaximumSize(new Dimension(30000, 200));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLoweredSoftBevelBorder());

        add(equation);
        add(result);
    }

    public void write(char c){
        result.setText(result.getText() + c);
    }
}
