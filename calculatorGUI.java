import javax.swing.*;
import java.awt.event.*;


public class calculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField resultField = new JTextField();
        JComboBox<String> operators = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        JButton calculateButton = new JButton("Calculate");

        textField1.setBounds(50, 40, 150, 30);
        operators.setBounds(210, 40, 50, 30);
        textField2.setBounds(270, 40, 150, 30);
        calculateButton.setBounds(150, 100, 100, 30);
        resultField.setBounds(50, 150, 370, 30);


        frame.add(textField1);
        frame.add(operators);
        frame.add(textField2);
        frame.add(calculateButton);
        frame.add(resultField);
        
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Action listener for the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                String operator = (String) operators.getSelectedItem();
                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            resultField.setText("Cannot divide by zero");
                            return;
                        }
                        break;
                }
                resultField.setText("Result: " + result);
            }
        });

        // Exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
