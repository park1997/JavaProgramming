package Chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListner extends JFrame {
    public InnerClassListner() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListner());
        c.add(btn);
        setSize(350, 150);
        setVisible(true);
    }

    private class MyActionListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
            } else {
                b.setText("Action");
            }
            InnerClassListner.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassListner();
    }
}
