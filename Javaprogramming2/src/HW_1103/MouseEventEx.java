package HW_1103;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventEx extends JFrame {
    JLabel la = new JLabel("C");

    MouseEventEx(){
        setTitle("2016112568 박병현");

        Container c = getContentPane();

        c.setLayout(null);
        c.addMouseListener(new MyMouseAda());

        la.setSize(20,20);
        la.setLocation(40,40);
        c.add(la);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
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
        // TODO Auto-generated method stub
        new MouseEventEx();
    }

}
