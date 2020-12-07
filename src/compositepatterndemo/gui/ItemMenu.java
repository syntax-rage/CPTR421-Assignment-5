package compositepatterndemo.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jason
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;        
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemMenu implements ActionListener{
    
    //private int count = 0;
    
    private JLabel label = new JLabel("Developed by Jason Rodriguez");
    private  JFrame frame;
    private JPanel panel;
    
    public ItemMenu() {
    
    frame = new JFrame();
    
    JButton button = new JButton("Cafe Decaf, Double Espresso, Extra Steamed Milk - $19,00");
    button.addActionListener(this);
    JButton button1 = new JButton("\"Cafe Mocha\", \"Espresso, Chocolate Syrup, Steamed Milk, Whipped Cream - $24.00");
    button.addActionListener(this);
    JButton button2 = new JButton("Dark Roasted Double Espresso and Foamy Steamed Milk - $22.00");
    button.addActionListener(this);
    JButton button3 = new JButton("House Blended Served with Whipped Cream - $15.00");
    button.addActionListener(this);
    JButton exitButton = new JButton("Exit");
    button.addActionListener(this);
    
    
    
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
    panel.setLayout(new GridLayout(0, 1));
    button.setPreferredSize(new Dimension(300, 50));
    panel.add(button);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(exitButton);
    exitButton.addActionListener((event) -> System.exit(0));
    button1.addActionListener((event) -> new CoffeeMenu());
    button2.addActionListener((event) -> new CoffeeMenu());
    button3.addActionListener((event) -> new CoffeeMenu());
    button.addActionListener((event) -> new CoffeeMenu());

    
    panel.add(label);
    
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Expresso's Coffehouse");
    frame.pack();
    frame.setVisible(true);
}

    

    @Override
    public void actionPerformed(ActionEvent e) {
    
            //label.setText("");
            
    
    }
public static void main(String[] args){
    new ItemMenu();
}

}

