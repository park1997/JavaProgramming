package Lec_1025;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main(){
        setTitle("배치관리자 실습");

        Container c = getContentPane();
        c.setLayout(null);  // 배치관리자 안쓰겠다!

        JButton bt = new JButton("실습");
        bt.setLocation(100,100);
        bt.setSize(80,30);
        bt.setBackground(Color.YELLOW);
        bt.addActionListener(new MyActionListener());   // 리스너 등록


        c.add(bt);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);

    }



    public static void main(String[] args) {
        new Main();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // 해야할 일
        JButton b = (JButton) e.getSource();
        if (b.getText().equals("실습")) {
            b.setText("액션");
        } else {
            b.setText("실습");
        }


    }


}
