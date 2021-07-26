package com.company.Swing;
// Even handling By using the Anonymous class
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling");
        JLabel label = new JLabel("Enter the Message");
        label.setBounds(60,50,170,20);
        JTextField text = new JTextField();
        text.setBounds(300,300,250,100);
        JButton btn = new JButton("Sent");
        btn.setBounds(50,120,80,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             text.setText("Hello EventListener");
            }
        });
        frame.add(label);
        frame.add(text);
        frame.add(btn);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
