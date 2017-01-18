package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumNumbersForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumButton;
    private JTextField resultField;
    private JPanel mainPanel;

    public SumNumbersForm() {
        sumButton.addActionListener(e -> {
            try {
                long a = Long.valueOf(textField1.getText());
                long b = Long.valueOf(textField2.getText());
                resultField.setText("" + (a + b));
            } catch (Exception ex) {
                resultField.setText(ex.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Сумма 2-х чисел");
        frame.setContentPane(new SumNumbersForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
