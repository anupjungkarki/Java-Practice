package com.company.Swing;

import javax.swing.*;
import java.awt.*;

public class FormUsingSwing {
    public static void main(String[] args) {
        // Header
        JFrame j = new JFrame("Simple Form");
        // For Panel
        JPanel p = new JPanel();
        p.setBounds(300,300,140,50);
        p.setBackground(Color.blue);

        // Create Form 1
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50,50,100,30);
        JTextField t1 = new JTextField();
        t1.setBounds(50,50,150,20);

        // Create Form 2
        JLabel l2 = new JLabel("Address:");
        l2.setBounds(50,50,100,30);
        JTextField t2 = new JTextField();
        t2.setBounds(50,50,150,20);

        //Button
        JButton btn = new JButton("ClickMe");
        btn.setBounds(50,100,95,30);

        //add to panel
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        // Adding Panel to JFrame
        j.add(p);
        j.setSize(500,50);
        j.setLayout(null);
        j.setVisible(true);
    }
}
