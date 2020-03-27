package org.hyperskill.samples.swing.components;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        initComponents();

        setLayout(null); // sets absolute positioning of components
        setVisible(true);
    }

    private void initComponents() {
        JLabel nameLabel = new JLabel("Your Name");
        nameLabel.setBounds(40,20, 100,30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(140,20, 120,30);
        add(nameTextField);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100,70,100,30);
        add(acceptButton);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courier", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel);

        acceptButton.addActionListener(e -> {
            String helloText = "Hello";
            String name = nameTextField.getText();
            if (name != null && name.trim().length() > 0) {
                helloText += String.format(", %s", name);
            }
            helloLabel.setText(helloText);
        });
    }

    public static void main(final String[] args) {
        new HelloFrame();
    }
}