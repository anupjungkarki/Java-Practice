package com.company.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingDemo2 extends Frame implements ActionListener {
     JTextField text;
     JButton btn;
     EventHandlingDemo2(){
        text = new JTextField();
        text.setBounds(50,50, 150,20);
        add(text);

        btn = new JButton("MessageMe");
        btn.setBounds(50,100,60,30);
        btn.addActionListener(this);
        add(btn);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("Hello EventListener");
    }

    public static void main(String[] args){
      new EventHandlingDemo2();
    }
}
