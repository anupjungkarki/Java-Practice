package com.company.Applet;
import java.applet.Applet;
import java.awt.Graphics;

//Extending the Applet class
class EduApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Welcome To Edureka's Applet Tutorial",150,150);
    }
}