import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TextEditor t = new TextEditor();
        t.setTitle("Text Editor");
        t.setSize(800, 600);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);

    }
}