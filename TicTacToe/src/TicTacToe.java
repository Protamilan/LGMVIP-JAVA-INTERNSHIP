import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener {
    private JFrame frame = new JFrame("Tic Tac Toe Game");
    private JPanel panel = new JPanel();
    private JButton[] buttons = new JButton[9];
    private JButton resetButton = new JButton("Reset Game");
    private JLabel turnLabel = new JLabel("Player O's Turn");
    private boolean xTurn = false;
    public TicTacToe() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.setLayout(new GridLayout(3, 3));
        panel.setBackground(Color.WHITE);
        frame.add(panel);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 100));
            panel.add(buttons[i]);
        }

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });
        resetButton.setFont(new Font("Arial", Font.BOLD, 30));
        resetButton.setBackground(Color.LIGHT_GRAY);
        frame.add(resetButton, "South");

        turnLabel.setFont(new Font("Arial", Font.BOLD, 30));
        turnLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(turnLabel, "North");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                if (buttons[i].getText().equals("")) {
                    if (xTurn) {
                        buttons[i].setText("X");
                        buttons[i].setForeground(Color.RED);
                        turnLabel.setText("Player O's Turn");
                    } else {
                        buttons[i].setText("O");
                        buttons[i].setForeground(Color.BLACK);
                        turnLabel.setText("Player X's Turn");
                    }
                    xTurn = !xTurn;
                    checkWin();
                }
            }
        }
    }
    private void checkWin() {
        // Check rows
        if (checkRow(0, 1, 2)) {
            declareWinner(0);
        } else if (checkRow(3, 4, 5)) {
            declareWinner(3);
        } else if (checkRow(6, 7, 8)) {
            declareWinner(6);
        }
        // Check columns
        else if (checkRow(0, 3, 6)) {
            declareWinner(0);
        } else if (checkRow(1, 4, 7)) {
            declareWinner(1);
        } else if (checkRow(2, 5, 8)) {
            declareWinner(2);
        }
        // Check diagonals
        else if (checkRow(0, 4, 8)) {
            declareWinner(0);
        } else if (checkRow(2, 4, 6)) {
            declareWinner(2);
        }
        // Check tie
        else if (isFull()) {
            JOptionPane.showMessageDialog(frame, "Tie Game!");
            resetGame();
        }
    }
    private boolean checkRow(int a, int b, int c) {
        return buttons[a].getText().equals(buttons[b].getText())
                && buttons[b].getText().equals(buttons[c].getText())
                && !buttons[a].getText().equals("");
    }
    private void declareWinner(int index) {
        disableButtons();
        String winner = buttons[index].getText();
        JOptionPane.showMessageDialog(frame, "Player " + winner + " wins!");
    }
    private boolean isFull() {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].getText().equals("")) {
                return false;
            }
        }
        return true;
    }
    private void resetGame() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        xTurn = true;
        turnLabel.setText("Player X's Turn");
    }
    private void disableButtons() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
    }
}
