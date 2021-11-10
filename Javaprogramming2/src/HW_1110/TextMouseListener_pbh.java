package HW_1110;

import HW_1103.MouseEventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TextMouseListener_pbh extends JFrame {
    private JTextField tf = new JTextField(20);
    private JLabel la = new JLabel();
    public TextMouseListener_pbh() {
        setTitle("실습과제 Event응용");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addMouseListener(new MyMouseAda());

        c.add(new JLabel("입력후 <Enter>"));
        c.add(tf);
        la.setSize(20,20);
        la.setLocation(40,40);
        c.add(la);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                la = (JLabel) e.getSource().getText();
                t.setText("");
            }
        });
        setSize(500, 300);
        setVisible(true);
    }
    class MyMouseAda extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            super.mousePressed(e);

            int x = e.getX();
            int y = e.getY();
            if(x>=la.getX() && x <= la.getX()+20 && y>=la.getY() && y <= la.getY()+20) {
                Random rand = new Random();
                int a = (int)(Math.random()*400-20);
                int b = (int)(Math.random()*400-20);
                la.setLocation(a,b);
            }
        }
    }

    public static void main(String[] args) {
        new TextMouseListener_pbh();
    }
}
