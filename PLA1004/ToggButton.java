import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;


class ToggButton implements ItemListener{
    static JLabel text;
    public static void main(String args[]){
        //creating a frame
        JFrame frame = new JFrame("Toggle button");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null); //Create an object 
        TogButton obj = new ToggButton();

    }


}