package FinalTerm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Main2020 extends JFrame {
    private JLabel str1 = new JLabel("잘했으면 스티커를 붙여주세요");
    private JButton btn1 = new JButton("몇 명?");
    private JLabel str2 = new JLabel("?!명");
    private int num = 0;
    public Main2020() {
        setTitle("박병현");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.add(new MyNorthPanel(), BorderLayout.NORTH);
        c.add(new MyPanel(), BorderLayout.CENTER);
        setVisible(true);
        setSize(400, 400);
    }

    class MyNorthPanel extends JPanel {
        MyNorthPanel() {
            setBackground(Color.GREEN);
            add(str1, new FlowLayout());
            add(btn1, new FlowLayout());
            add(str2, new FlowLayout());

            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String temp = Integer.toString(num) + "명";
                    str2.setText(temp);
                }
            });

        }
    }

    class MyPanel extends JPanel {
        private Vector<Point> dot = new Vector<Point>();
        MyPanel() {
            setBackground(Color.YELLOW);
            addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    num += 1;
                    dot.add(e.getPoint());
                    repaint();
                }
            });

        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            for (int i = 0; i < dot.size(); i++) {
                Point s = dot.elementAt(i);
                g.fillOval((int) s.getX(), (int) s.getY(), 10,10);
            }
        }
    }

    public static void main(String[] args) {
        new Main2020();
    }
}
