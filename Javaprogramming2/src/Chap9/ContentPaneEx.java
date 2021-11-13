package Chap9;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contantPane = getContentPane();
        contantPane.setBackground(Color.ORANGE);
        contantPane.setLayout(new FlowLayout());

        contantPane.add(new JButton("OK"));
        contantPane.add(new JButton("Cancle"));
        contantPane.add(new JButton("Ignore"));


        setSize(300, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
