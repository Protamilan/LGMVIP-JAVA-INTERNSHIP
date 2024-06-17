import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame {
    private JTextField displayField;
    private double num1, num2, result;
    private String operator = "";
    public ScientificCalculator() {
        displayField = new JTextField();
        displayField.setEditable(true);
        displayField.setForeground(Color.CYAN);
        displayField.setBackground(Color.DARK_GRAY);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.BOLD, 70));
        JPanel mainPanel = new JPanel(new GridLayout(5, 4));
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBackground(Color.DARK_GRAY);
        buttonDivide.setForeground(Color.WHITE);
        buttonDivide.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 35));
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBackground(Color.DARK_GRAY);
        buttonMultiply.setForeground(Color.yellow);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 35));
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.CYAN);
        button1.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button1.setFont(new Font("Arial", Font.BOLD, 35));
        button2.setBackground(Color.DARK_GRAY);
        button2.setForeground(Color.CYAN);
        button2.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button2.setFont(new Font("Arial", Font.BOLD, 35));
        button3.setBackground(Color.DARK_GRAY);
        button3.setForeground(Color.CYAN);
        button3.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button3.setFont(new Font("Arial", Font.BOLD, 35));
        button4.setBackground(Color.DARK_GRAY);
        button4.setForeground(Color.CYAN);
        button4.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button4.setFont(new Font("Arial", Font.BOLD, 35));
        button5.setBackground(Color.DARK_GRAY);
        button5.setForeground(Color.CYAN);
        button5.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button5.setFont(new Font("Arial", Font.BOLD, 35));
        button6.setBackground(Color.DARK_GRAY);
        button6.setForeground(Color.CYAN);
        button6.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button6.setFont(new Font("Arial", Font.BOLD, 35));
        button7.setBackground(Color.DARK_GRAY);
        button7.setForeground(Color.CYAN);
        button7.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button7.setFont(new Font("Arial", Font.BOLD, 35));
        button8.setBackground(Color.DARK_GRAY);
        button8.setForeground(Color.CYAN);
        button8.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button8.setFont(new Font("Arial", Font.BOLD, 35));
        button9.setBackground(Color.DARK_GRAY);
        button9.setForeground(Color.CYAN);
        button9.setBorder(BorderFactory.createBevelBorder(1,Color.CYAN,Color.CYAN,Color.CYAN,Color.CYAN));
        button9.setFont(new Font("Arial", Font.BOLD, 35));
        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setBackground(Color.DARK_GRAY);
        buttonSubtract.setForeground(Color.WHITE);
        buttonSubtract.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonSubtract.setFont(new Font("Arial", Font.BOLD, 35));
        JButton button0 = new JButton("0");
        button0.setBackground(Color.DARK_GRAY);
        button0.setForeground(Color.yellow);
        button0.setFont(new Font("Arial", Font.BOLD, 35));
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setBackground(Color.DARK_GRAY);
        buttonDecimal.setForeground(Color.WHITE);
        buttonDecimal.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonDecimal.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonPi = new JButton("π");
        buttonPi.setBackground(Color.DARK_GRAY);
        buttonPi.setForeground(Color.WHITE);
        buttonPi.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonPi.setFont(new Font("Arial", Font.BOLD, 35));
        JButton buttonAdd = new JButton("+");
        buttonAdd.setBackground(Color.DARK_GRAY);
        buttonAdd.setForeground(Color.yellow);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 35));
        JButton buttonClear = new JButton("AC");
        buttonClear.setBackground(Color.DARK_GRAY);
        buttonClear.setForeground(Color.WHITE);
        buttonClear.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonClear.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonDelete = new JButton("C");
        buttonDelete.setBackground(Color.DARK_GRAY);
        buttonDelete.setForeground(Color.WHITE);
        buttonDelete.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonPower = new JButton("^");
        buttonPower.setBackground(Color.DARK_GRAY);
        buttonPower.setForeground(Color.WHITE);
        buttonPower.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonPower.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonSin = new JButton("sin");
        buttonSin.setFont(new Font("Arial", Font.BOLD, 25));
        buttonSin.setBackground(Color.DARK_GRAY);
        buttonSin.setForeground(Color.yellow);
        JButton buttonCos = new JButton("cos");
        buttonCos.setBackground(Color.DARK_GRAY);
        buttonCos.setForeground(Color.YELLOW);
        buttonCos.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonTan = new JButton("tan");
        buttonTan.setBackground(Color.DARK_GRAY);
        buttonTan.setForeground(Color.yellow);
        buttonTan.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonLog = new JButton("log");
        buttonLog.setBackground(Color.DARK_GRAY);
        buttonLog.setForeground(Color.YELLOW);
        buttonLog.setFont(new Font("Arial",Font.BOLD,25));
        JButton buttonSqrt = new JButton("sqrt");
        buttonSqrt.setBackground(Color.DARK_GRAY);
        buttonSqrt.setForeground(Color.WHITE);
        buttonSqrt.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 25));
        JButton buttonEquals = new JButton("Ans");
        buttonEquals.setBackground(Color.DARK_GRAY);
        buttonEquals.setForeground(Color.WHITE);
        buttonEquals.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.white,Color.white,Color.white));
        buttonEquals.setFont(new Font("Arial", Font.BOLD, 25));
        button0.addActionListener(new NumberButtonActionListener("0"));
        button1.addActionListener(new NumberButtonActionListener("1"));
        button2.addActionListener(new NumberButtonActionListener("2"));
        button3.addActionListener(new NumberButtonActionListener("3"));
        button4.addActionListener(new NumberButtonActionListener("4"));
        button5.addActionListener(new NumberButtonActionListener("5"));
        button6.addActionListener(new NumberButtonActionListener("6"));
        button7.addActionListener(new NumberButtonActionListener("7"));
        button8.addActionListener(new NumberButtonActionListener("8"));
        button9.addActionListener(new NumberButtonActionListener("9"));
        buttonDecimal.addActionListener(new NumberButtonActionListener("."));
        buttonPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayField.setText(Double.toString(Math.PI));
            }
        });
        buttonAdd.addActionListener(new OperatorButtonAction("+"));
        buttonSubtract.addActionListener(new OperatorButtonAction("-"));
        buttonMultiply.addActionListener(new OperatorButtonAction("*"));
        buttonDivide.addActionListener(new OperatorButtonAction("/"));
        buttonPower.addActionListener(new OperatorButtonAction("^"));
        buttonSin.addActionListener(new FunctionButtonAction("sin"));
        buttonCos.addActionListener(new FunctionButtonAction("cos"));
        buttonTan.addActionListener(new FunctionButtonAction("tan"));
        buttonLog.addActionListener(new FunctionButtonAction("log"));
        buttonSqrt.addActionListener(new FunctionButtonAction("sqrt"));
        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(displayField.getText());
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
                        break;
                    case "^":
                        result = Math.pow(num1, num2);
                        break;
                }
                displayField.setText(Double.toString(result));
                num1 = result;
                operator = "";
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = 0;
                num2 = 0;
                result = 0;
                operator = "";
                displayField.setText("");
            }
        });
        buttonDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = displayField.getText();
                if (currentText.length() > 0) {
                    displayField.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });
        mainPanel.add(buttonClear);
        mainPanel.add(buttonDelete);
        mainPanel.add(buttonPower);
        mainPanel.add(buttonPi);
        mainPanel.add(buttonEquals);
        mainPanel.add(buttonSin);
        mainPanel.add(buttonCos);
        mainPanel.add(buttonTan);
        mainPanel.add(buttonLog);
        mainPanel.add(buttonSqrt);
        mainPanel.add(button7);
        mainPanel.add(button8);
        mainPanel.add(button9);
        mainPanel.add(buttonAdd);
        mainPanel.add(buttonSubtract);
        mainPanel.add(button4);
        mainPanel.add(button5);
        mainPanel.add(button6);
        mainPanel.add(buttonMultiply);
        mainPanel.add(buttonDivide);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(button3);
        mainPanel.add(button0);
        mainPanel.add(buttonDecimal);
        add(displayField, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        setTitle("Scientific Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 700);
    }
    private class NumberButtonActionListener implements ActionListener {
        private String number;

        public NumberButtonActionListener(String number) {
            this.number = number;
        }

        public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + number);
        }
    }
    private class OperatorButtonAction implements ActionListener {
        private String op;

        public OperatorButtonAction(String op) {
            this.op = op;
        }

        public void actionPerformed(ActionEvent e) {
            num1 = Double.parseDouble(displayField.getText());
            operator = op;
            displayField.setText("");
        }
    }
    private class FunctionButtonAction implements ActionListener {
        private String function;

        public FunctionButtonAction(String function) {
            this.function = function;
        }

        public void actionPerformed(ActionEvent e) {
            double value = Double.parseDouble(displayField.getText());
            switch (function) {
                case "sin":
                    value = Math.sin(value);
                    break;
                case "cos":
                    value = Math.cos(value);
                    break;
                case "tan":
                    value = Math.tan(value);
                    break;
                case "log":
                    value = Math.log10(value);
                    break;
                case "sqrt":
                    value = Math.sqrt(value);
                    break;
            }
            displayField.setText(Double.toString(value));
        }
    }
}
