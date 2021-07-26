package com.company.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2019{
    JFrame f = new JFrame();
    Swing2019(){
        JLabel l1,l2;
        JTextField t1,t2;
        JButton btn;
        l1 = new JLabel("Enter Number First:");
        l1.setSize(200,20);
        l1.setLocation(20,50);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(100 ,50,200,20);
        f.add(t1);


        l2 = new JLabel("Square is:");
        l2.setSize(200,20);
        l2.setLocation(20,80);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(100 ,80,200,20);
        f.add(t2);

        btn = new JButton("SQUARE");
        btn.setBounds(100,120,100,20);
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(t1.getText());
                int result = x * x;
                t2.setText(String.valueOf(result));
            }
        });

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
     new Swing2019();
    }
}
