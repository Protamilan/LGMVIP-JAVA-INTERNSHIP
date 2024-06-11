import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            CurrencyConverter convert = new CurrencyConverter();

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}