package com.company.Swing;
import  javax.swing.*;
public class SimpleExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("This is The First Swing Program");

        JTextField t1 = new JTextField();
        t1.setBounds(200,50,200,20);

        JButton bt = new JButton("ClickMe");
        bt.setBounds(100,100,100,50);

        jf.add(t1);
        jf.add(bt);

        jf.setSize(1200,900);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
