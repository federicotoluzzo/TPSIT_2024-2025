package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
        setBorder(BorderFactory.createRaisedBevelBorder());

        addActionListener(e -> {
            setBorder(BorderFactory.createLoweredBevelBorder());
            if(isResultKey){
                calculator.evaluate();
                try {
                    TimeUnit.MILLISECONDS.sleep(200);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                setBorder(BorderFactory.createRaisedBevelBorder());
                return;
            }
            System.out.println(key);
            calculator.write(key);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            setBorder(BorderFactory.createRaisedBevelBorder());
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
