package calculator;

import javax.swing.*;

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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }

        pack();
    }

    public void write(char key){
        display.write(key);
        //pack();
    }

    public void evaluate(){
        display.equation.setText(display.result.getText());
        display.result.setText(solveEquation(display.result.getText()));
    }

    private String solveEquation(String equation){
        int operatorPos;
        char operator = '=';
        double number1 = 0;
        double number2 = 0;
        for(int i = 0; i < equation.length(); i++){
            if(KeypadButton.OPERATORS.contains(equation.charAt(i))){
                operatorPos = i;
                operator = equation.charAt(i);
                number1 = Double.parseDouble(equation.substring(0, operatorPos));
                number2 = Double.parseDouble(equation.substring(operatorPos + 1, equation.length()));
            }
        }
        return switch (operator){
            case '+' -> Double.toString(number1 + number2);
            case '-' -> Double.toString(number1 - number2);
            case '*' -> Double.toString(number1 * number2);
            case '/' -> Double.toString(number1 / number2);
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
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
