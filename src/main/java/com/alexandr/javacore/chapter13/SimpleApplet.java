package com.alexandr.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {

    @Override
    public void paint(Graphics graphics){
        graphics.drawString("Simple applet", 20, 20);
    }
}
