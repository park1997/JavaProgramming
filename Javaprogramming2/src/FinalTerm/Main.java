package FinalTerm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

public class Main extends JFrame {
    JLabel la = new JLabel("파일명 입력(ENTER)");
    JTextField tf = new JTextField(20);
    FileInputStream fin = null;
    JButton btn = new JButton("영상보기 (Toggle)");
    public Main(){
        setTitle("박병현");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new NorthPanel(),BorderLayout.NORTH);
        c.add(new MyPanel(), BorderLayout.CENTER);
        setVisible(true);
        setSize(400, 400);
    }

    class NorthPanel extends JPanel {
        NorthPanel(){
            setBackground(Color.YELLOW);
            add(la);
            add(tf);
            tf.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JTextField tf2 = (JTextField) e.getSource();
                    String str = tf2.getText();
                    try {
                        fin = new FileInputStream(str);
                    } catch (FileNotFoundException fileNotFoundException) {
                        System.out.println("파일을 찾을 수 없습니다.");
                    }
                }
            });

        }
    }

    class MyPanel extends JPanel {
        private Vector<Point> vStart = new Vector<Point>();
        private Vector<Point> vEnd = new Vector<Point>();
        MyPanel() {
            setBackground(Color.PINK);
            add(btn);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    Point endP = e.getPoint();
                    vEnd.add(endP);
                    repaint();
                }
            });

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            for (int i = 0; i < vStart.size(); i++) {
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);

                int width = (int) s.getX() - (int) e.getX();
                int height = (int) s.getY() - (int) e.getY();
                if (width < 0) {
                    width *= -1;
                }
                if (height < 0) {
                    height *= -1;
                }
                g.drawRect((int) s.getX(), (int) s.getY(), width, height);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
