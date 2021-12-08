package FinalTerm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

public class Main2021_1 extends JFrame {
    JLabel la1 = new JLabel("파일명 입력(Enter) ");
    JTextField tf = new JTextField(20);
    JButton btn = new JButton("영상보기 (Toggle)");
    FileInputStream fin = null;
    String str = "src/HW_1201/실험영상 업로드/회색영상/COUPLE256X256.dat";
    Vector<Point> vs = new Vector<Point>();
    Vector<Point> ve = new Vector<Point>();

    public Main2021_1() {
        setTitle("박병현");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new MyNorthPanel(), BorderLayout.NORTH);
        c.add(new MyPanel(), BorderLayout.CENTER);
        setVisible(true);
        setSize(400, 400);
    }

    class MyNorthPanel extends JPanel {
        public MyNorthPanel() {
            setBackground(Color.YELLOW);
            add(la1);
            add(tf);
            tf.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String str = ((JTextField) e.getSource()).getText();
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

        boolean pic = false;
        private Graphics g;

        public MyPanel() {
            setBackground(Color.PINK);
            add(btn, BorderLayout.CENTER);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mouseClicked(e);
                    Point startP = e.getPoint();
                    vs.add(startP);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    Point endP = e.getPoint();
                    ve.add(endP);
                    repaint();
                }
            });
            btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (pic) {
                        pic = false;
                    } else {
                        pic = true;
                    }
                    repaint();
                }
            });
        }



        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            int data[] = new int[256 * 256];
            int W = 256;
            int H = 256;
            int n = 0;
            int temp = 0;

            try {
                fin = new FileInputStream(str);
                while ((temp = fin.read()) != -1) {
                    data[n] = temp;
                    n += 1;
                }
                fin.close();
            } catch (FileNotFoundException e) {
                System.out.println("파일을 찾을 수 없습니다.");
            } catch (IOException e) {
                System.out.println("오류발생");
            }

            int bright = 100;
            int pix[][] = new int[400][400];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    pix[i][j] = data[i * W + j] + bright;
//                    pix[i][j] = 255 - data[i * W + j] + bright; // 반전 된 영상
                    if (pix[i][j] > 255) {
                        pix[i][j] = 255;
                    }
                }
            }

            if (pic) {
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        g.setColor(new Color(pix[i][j], pix[i][j], pix[i][j]));
                        g.drawOval(50+j,50+i,1,1);
                    }
                }
            }
            g.setColor(Color.RED);
            for (int i = 0; i < vs.size(); i++) {
                Point s = vs.elementAt(i);
                Point e = ve.elementAt(i);

                int width = (int) s.getX() - (int) e.getX();
                int height = (int) s.getY() - (int) e.getY();
                if (width < 0) {
                    width *= -1;
                }
                if (height < 0) {
                    height *= -1;
                }
//                g.drawRect((int) s.getX(), (int) s.getY(), width, height);
                g.drawRect((int) s.getX(), (int) s.getY(), width, height);
//                g.drawRect(vs[0].x, po[0].y, po[1].x, po[1].y);

            }
        }
    }

    public static void main(String[] args) {
        new Main2021_1();
    }
}
