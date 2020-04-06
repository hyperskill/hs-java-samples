package org.hyperskill.samples.swing.layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {
        super("Grid Layout Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));
        add(new JLabel("This is another label"));

        setLayout(new GridLayout(3, 3, 5, 5));
        setVisible(true);
    }

    public static void main(final String[] args) {
        new GridLayoutExample();
    }
}

