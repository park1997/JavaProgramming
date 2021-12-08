
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Main extends JFrame {
    private JButton btn1 = new JButton("찬성");
    private JLabel str1 = new JLabel("이름: 박병현");
    private JLabel str2 = new JLabel("학번 : 2016112568");
    private int num = 0;
    private boolean flag = true;
    private int end_index = 0;
    private int blue[] = new int[100];
    private int red[] = new int[100];

    public Main() {
        setTitle("융프2 기말고사");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.add(new MyWestPanel(), BorderLayout.WEST);
        c.add(new MyPanel(), BorderLayout.CENTER);
        setVisible(true);
        setSize(400, 400);
    }

    class MyWestPanel extends JPanel {
        MyWestPanel() {
            setBackground(Color.YELLOW);
            add(btn1,BorderLayout.NORTH);
            add(str1,BorderLayout.CENTER);
            add(str2,BorderLayout.SOUTH);

            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (flag) {
                        btn1.setText("반대");
                        flag = false;
                    } else {
                        btn1.setText("찬성");
                        flag = true;
                    }
                }
            });

        }
    }

    class MyPanel extends JPanel {
        private Vector<Point> dot = new Vector<Point>();
        MyPanel() {
            setBackground(Color.pink);
            addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    dot.add(e.getPoint());
                    repaint();
                }
            });

        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (flag) {
                g.setColor(Color.BLUE);
            } else {
                g.setColor(Color.RED);
            }


            for (int i = 0; i < dot.size(); i++) {
                Point s = dot.elementAt(i);

                g.fillOval((int) s.getX(), (int) s.getY(), 10,10);

            }

//            for (int i = 0; i < blue.length; i++) {
//                Point s = dot.elementAt(blue[i]);
//                g.setColor(Color.BLUE);
//                g.fillOval((int) s.getX(), (int) s.getY(), 10,10);
//            }
//
//            for (int i = 0; i < red.length; i++) {
//                Point s = dot.elementAt(red[i]);
//                g.setColor(Color.RED);
//                g.fillOval((int) s.getX(), (int) s.getY(), 10,10);
//            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
