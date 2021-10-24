package HW_1027;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("10 Colors Button");
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(1, 10));
        JButton[] jb = new JButton[10];
        int[][] ColorArray = {{255, 0, 0}, {255, 50, 0}, {255, 255, 0}, {0, 255, 0}, {0, 0, 255}, {0, 5, 255}, {100, 0, 255}, {255, 5, 10}, {220, 50, 45}, {34, 55, 100}};

        for (int i = 0; i < 10; i++) {
            jb[i] = new JButton(""+i);
            Color ArrayColor = new Color(ColorArray[i][0], ColorArray[i][1], ColorArray[i][2]);
            jb[i].setBackground(ArrayColor);
            jb[i].addActionListener(new MyActionListener());
            add(jb[i]);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 300);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setBackground(Color.WHITE);
            }
        }
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

    }
}
