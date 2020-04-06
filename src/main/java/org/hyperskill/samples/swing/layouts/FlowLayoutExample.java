package org.hyperskill.samples.swing.layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    public FlowLayoutExample() {
        super("Flow Layout Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JTextField("Enter your text here"));
        add(new JLabel("This is a long label"));
        add(new JButton("Third"));

        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        setVisible(true);
    }

    public static void main(final String[] args) {
        new FlowLayoutExample();
    }
}
