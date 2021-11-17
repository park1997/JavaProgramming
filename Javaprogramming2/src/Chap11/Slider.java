package Chap11;

import javax.swing.*;
import java.awt.*;

public class Slider extends JFrame {
    public Slider() {
        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMajorTickSpacing(10);

        c.add(slider);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Slider();
    }
}
