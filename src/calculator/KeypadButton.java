package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Set;

public class KeypadButton extends JButton {
    public static final Set<Character> KEYS = Set.of('7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '.', '0', '=', '/');
    public static final Set<Character> OPERATORS = Set.of('+', '-', '*', '/');

    public final int KEY;
    public final boolean isResultKey;
    public KeypadButton(Calculator calculator, char key, int size, boolean isResultKey) {
        this.KEY = key;
        this.isResultKey = isResultKey;

        setPreferredSize(new Dimension(size, size));
        setText(String.valueOf(key));

        addActionListener(e -> {
            if(isResultKey){
                calculator.evaluate();
                return;
            }
            System.out.println(key);
            calculator.write(key);
        });

        addComponentListener(new ComponentAdapter() {
             @Override
             public void componentResized(ComponentEvent e) {
                 super.componentResized(e);
                 setFont(new Font("Comic Sans MS", Font.BOLD,  (int) (getSize().getHeight() * 0.6)));
             }
        });
    }
}
