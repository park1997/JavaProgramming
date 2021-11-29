package Chap12;

import javax.swing.*;
import java.awt.*;

public class GraphicsFrawImagesEx1 extends JFrame {
    private MyPanel panel = new MyPanel();
    public GraphicsFrawImagesEx1() {
        setTitle("원본 크기로 원하는 위치에 이미지 그리기 ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 420);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("src/Chap11/images/apple.jpeg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img,20,20,this);
        }
    }

    public static void main(String[] args) {
        new GraphicsFrawImagesEx1();
    }
}
