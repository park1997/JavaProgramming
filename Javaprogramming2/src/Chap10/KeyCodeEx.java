package Chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();

    public KeyCodeEx() {
        setTitle("Key Code 예제 : F1키: 초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
//        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

//    class MyKeyListener extends KeyAdapter {
//        public void keyPressed(KeyEvent e) {
//            int keyCode = e.getKeyCode();
//            char keyChar = e.getKeyChar();
//            la.setText(e.getKeyText(keyCode));
//
//            if (keyChar == '%') {
//                contantPane.setBackground(Color.white);
//            } else if (keyChar == KeyEvent.VK_F1) {
//                contantPane.setBackground(Color.GREEN);
//            }
//        }
//    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
