package Chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
    private String fruits[] = {"apple", "banana", "kiwi", "mango"};
    private ImageIcon images[] = {new ImageIcon("src/Chap11/images/apple.jpeg"), new ImageIcon("src/Chap11/images/cherry.jpeg"), new ImageIcon("src/Chap11/images/heart.jpeg"), new ImageIcon("src/Chap11/images/heart2.jpeg")};
    private JLabel imgLabel = new JLabel(images[0]);
    private JComboBox<String> strCombo = new JComboBox<String>(fruits);
    public ComboActionEx() {
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(strCombo);
        c.add(imgLabel);

        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox) e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });

        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
