package calculator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculator extends JFrame {

    public Display display;
    public Keypad keypad;

    public Calculator() {
        display = new Display();
        keypad = new Keypad(this, 10);

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(display);
        add(keypad);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        pack();
    }

    public void write(char key){
        display.write(key);
        pack();
    }

    public void evaluate(){
        display.equation.setText(display.result.getText());
        display.result.setText(solveEquation(display.result.getText()));
    }

    private String solveEquation(String equation){
        int operatorPos;
        char operator;
        double number1;
        double number2;
        for(int i = 0; i < equation.length(); i++){
            if(KeypadButton.OPERATORS.contains(equation.charAt(i))){
                operatorPos = i;
                operator = equation.charAt(i);
                number1 = Double.parseDouble(equation.substring(i, operatorPos - 1));
                number2 = Double.parseDouble(equation.substring(operatorPos + 1, equation.length()));
            }
        }
    }
/*
    private String solveEquation(String equation) {
        ArrayList<Double> values = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        String currentNumber = "";

        for(char c : equation.toCharArray()) {
            if(KeypadButton.OPERATORS.contains(c)) {
                values.add(Double.parseDouble(currentNumber));
                currentNumber = "";
                operators.add(c);
            }
        }
        return currentNumber;
    }*/
}
