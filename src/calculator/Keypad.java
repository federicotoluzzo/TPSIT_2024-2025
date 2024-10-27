package calculator;

import javax.swing.*;
import java.awt.*;

public class Keypad extends JPanel {
    KeypadButton[][] keypadButtons = new KeypadButton[4][4];

    public Keypad(Calculator calculator, int gap) {
        keypadButtons[0][0] = new KeypadButton(calculator,'7', 50, false);
        keypadButtons[0][1] = new KeypadButton(calculator,'8', 50, false);
        keypadButtons[0][2] = new KeypadButton(calculator,'9', 50, false);
        keypadButtons[0][3] = new KeypadButton(calculator,'+', 50, false);
        keypadButtons[1][0] = new KeypadButton(calculator,'4', 50, false);
        keypadButtons[1][1] = new KeypadButton(calculator,'5', 50, false);
        keypadButtons[1][2] = new KeypadButton(calculator,'6', 50, false);
        keypadButtons[1][3] = new KeypadButton(calculator,'-', 50, false);
        keypadButtons[2][0] = new KeypadButton(calculator,'1', 50, false);
        keypadButtons[2][1] = new KeypadButton(calculator,'2', 50, false);
        keypadButtons[2][2] = new KeypadButton(calculator,'3', 50, false);
        keypadButtons[2][3] = new KeypadButton(calculator,'*', 50, false);
        keypadButtons[3][0] = new KeypadButton(calculator,'.', 50, false);
        keypadButtons[3][1] = new KeypadButton(calculator,'0', 50, false);
        keypadButtons[3][2] = new KeypadButton(calculator,'=', 50, true);
        keypadButtons[3][3] = new KeypadButton(calculator,'/', 50, false);

        setLayout(new GridLayout(4, 4, gap, gap));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                add(keypadButtons[i][j]);
            }
        }
    }
}
