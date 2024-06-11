
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame implements ActionListener{

    private JLabel l1, l2, l3, l4,l5;
    private JTextField t1;
    private JComboBox<String> comboBox1, comboBox2;
    private JButton button;
    private final String[] CURRENCIES = {"Select","INR", "USD", "EUR", "GBP", "CAD", "AUD", "JPY", "CHF", "CNY", "HKD", "KRW", "MXN", "NOK", "NZD", "SEK", "SGD", "THB", "TRY", "ZAR"};
    private final double[] EXCHANGE_RATES = {1, 84.24, 89.57, 97.75, 62.45, 56.33, 0.523, 90.53, 13.52, 12.21, 0.07, 5.78, 7.35, 2.44, 8.07, 59.78, 3.09, 19.85, 5.54};
    public CurrencyConverter() {
        //Setting up Swing Frame
        JFrame frame = new JFrame("Conversion");
        // Set the values, bounds, to textfield,labels,button
        l1 = new JLabel("Amount: ");
        l1.setBounds(50, 25, 100, 30);
        l2 = new JLabel("From: ");
        l2.setBounds(50, 75, 100, 30);
        l3 = new JLabel("To:");
        l3.setBounds(50, 120, 100, 30);
        l4 = new JLabel("Press Convert to Calculate");
        l4.setBounds(120, 220, 200, 30);
        l5 = new JLabel("Result: ");
        l5.setBounds(50, 220, 200, 30);
        t1 = new JTextField("");
        t1.setBounds(100, 25, 100, 30);
        comboBox1 = new JComboBox<>(CURRENCIES);
        comboBox1.setBounds(100, 75, 100, 30);
        comboBox1.setSelectedIndex(0);
        comboBox2 = new JComboBox<>(CURRENCIES);
        comboBox2.setBounds(100, 120, 100, 30);
        comboBox2.setSelectedIndex(0);
        button = new JButton("Convert ");
        button.addActionListener(this);
        button.setBounds(150, 180, 100, 30);
        //Adding labels  and textfield to the frame
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(t1);
        //Adding Comboboxes
        frame.add(comboBox1);
        frame.add(comboBox2);
        // Set the frame size and layout manager to null (absolute positioning)
        frame.setSize(400, 350);
        frame.setLayout(null);
        //Setup Icon Image
        frame.setIconImage(logo.getImage());
        // Make the frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            public void actionPerformed(ActionEvent e) {
                     try {
                         double amount = Double.parseDouble(t1.getText());
                         int from = comboBox1.getSelectedIndex()-1;
                         int to = comboBox2.getSelectedIndex()-1;
                         double result = amount * EXCHANGE_RATES[from] / EXCHANGE_RATES[to];
                         DecimalFormat df = new DecimalFormat("#.##");
                         l4.setText(df.format(result)+" "+CURRENCIES[to]);
                     } catch (NumberFormatException ex) {
                         JOptionPane.showMessageDialog(this, "Please Enter Valid Amount");
                     }

                     }}

