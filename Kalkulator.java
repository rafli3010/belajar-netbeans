import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Kalkulator extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonDot;

    private String operand1, operand2;
    private String operator;

    public Kalkulator() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setSize(350, 400);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 300, 40);

        button7 = new JButton("7");
        button7.setBounds(10, 60, 60, 40);

        button8 = new JButton("8");
        button8.setBounds(80, 60, 60, 40);

        button9 = new JButton("9");
        button9.setBounds(150, 60, 60, 40);

        buttonDivide = new JButton("/");
        buttonDivide.setBounds(250, 60, 60, 40);

        button4 = new JButton("4");
        button4.setBounds(10, 120, 60, 40);

        button5 = new JButton("5");
        button5.setBounds(80, 120, 60, 40);

        button6 = new JButton("6");
        button6.setBounds(150, 120, 60, 40);

        buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(250, 120, 60, 40);

        button1 = new JButton("1");
        button1.setBounds(10, 180, 60, 40);

        button2 = new JButton("2");
        button2.setBounds(80, 180, 60, 40);

        button3 = new JButton("3");
        button3.setBounds(150, 180, 60, 40);

        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(250, 180, 60, 40);

        button0 = new JButton("0");
        button0.setBounds(10, 240, 130, 40);

        buttonDot = new JButton(".");
        buttonDot.setBounds(150, 240, 60, 40);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(250, 240, 60, 40);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(10, 300, 300, 40);

        add(textField);
        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(buttonAdd);
        add(buttonSubtract);
        add(buttonMultiply);
        add(buttonDivide);
        add(buttonEqual);
        add(buttonDot);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == button0 || source == button1 || source == button2 || source == button3 || source == button4
                || source == button5 || source == button6 || source == button7 || source == button8
                || source == button9) {
            textField.setText(textField.getText() + source.getText());
        } else if (source == buttonAdd || source == buttonSubtract || source == buttonMultiply
                || source == buttonDivide) {
            operand1 = textField.getText();
            operator = source.getText();
            textField.setText("");
        } else if (source == buttonEqual) {
            operand2 = textField.getText();
            double num1 = Double.parseDouble(operand1);
            double num2 = Double.parseDouble(operand2);
            double result = 0.0;

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
                    result = num1 / num2;
                    break;
            }

            textField.setText(String.valueOf(result));
        } else if (source == buttonDot) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Kalkulator().setVisible(true);
        });
    }
}
