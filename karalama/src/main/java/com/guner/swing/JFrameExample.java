package com.guner.swing;

import javax.swing.*;
  
// Class 1
// Helper class extending JFrame class
class JFrameExample extends JFrame {
  
    // JFrame
    JFrame f;
  
    // JButton
    JButton b, b1, b2;
  
    // Label to display text
    JLabel l;
  
    // Main class
    public static void main(String[] args)
    {
        JFrameExample j= new JFrameExample();
        j.execute();
    }

    private void execute() {
        // Creating a new frame to store text field and
        // button
        f = new JFrame("panel");

        // Creating a label to display text
        l = new JLabel("panel label");

        // Creating a new buttons
        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");

        //java.net.URL imgURL = getClass().getResource("../../../src/pembe.png");
        //ImageIcon icon = new ImageIcon( "src/img/pembe.png");
        java.net.URL imgURL = getClass().getClassLoader().getResource("img/pembe.png");
        //java.net.URL imgURL = getClass().getClassLoader().getResource("src/img/dice4.png");
        ImageIcon icon = new ImageIcon( imgURL);
        JLabel label1 = new JLabel("Image and Text", icon, JLabel.CENTER);
        //label1.setIcon(icon);


        // Creating a panel to add buttons
        JPanel p = new JPanel();

        // Adding buttons and textfield to panel
        // using add() method
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);
        p.add(label1);

        Thread thread = new Thread(()-> {
            try {
                Thread.sleep(2000);
                java.net.URL imgURL2 = getClass().getClassLoader().getResource("img/zar.png");
                ImageIcon icon2 = new ImageIcon( imgURL2);
                JLabel label2 = new JLabel("Image and Text2", icon2, JLabel.CENTER);

                p.add(label2);
                p.revalidate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();



        // setbackground of panel
        //p.setBackground(Color.red);

        // Adding panel to frame
        f.add(p);

        // Setting the size of frame
        f.setSize(600, 600);

        f.show();
    }
}