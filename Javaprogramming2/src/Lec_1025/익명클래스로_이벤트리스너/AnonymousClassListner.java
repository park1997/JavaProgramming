package Lec_1025.익명클래스로_이벤트리스너;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassListner extends JFrame {
    public AnonymousClassListner() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action")) {
                    b.setText("액션");
                } else {
                    b.setText("Action");
                }
            }
        });
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListner();
    }
}
