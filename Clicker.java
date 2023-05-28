package cs1102;

import java.awt.event.*;
import javax.swing.*;
public class Clicker extends JFrame implements ActionListener {
    int count;
    JButton button;
    Clicker() {
        super("Click Me");
        button = new JButton(String.valueOf(count));
        add(button);
        button.addActionListener(this);
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        count++;
        button.setText(String.valueOf(count));
    }
    public static void main(String[] args) { new Clicker(); }
}