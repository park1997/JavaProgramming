package Lec_1025.이벤트리스너;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    InnerClassListener() {
        setTitle("Action");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyactionListener());
        c.add(btn);
        setSize(350, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class MyactionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
            } else {
                b.setText("Action");
            }
            InnerClassListener.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new InnerClassListener();
    }
}

