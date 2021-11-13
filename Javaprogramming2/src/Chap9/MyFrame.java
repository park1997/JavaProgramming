package Chap9;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300스윙 프레임 만들기");
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
