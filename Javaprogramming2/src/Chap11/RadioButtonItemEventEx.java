package Chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventEx extends JFrame {
    private String text[] = {"사과", "배", "체리"};
    private JRadioButton radio[] = new JRadioButton[text.length];
    private JLabel imageLabel = new JLabel();
    private ImageIcon appleIcon = new ImageIcon("src/Chap11/images/apple.jpeg");
    private ImageIcon pearIcon = new ImageIcon("src/Chap11/images/pear.jpeg");
    private ImageIcon cherryIcon = new ImageIcon("src/Chap11/images/cherry.jpeg");
    public RadioButtonItemEventEx() {
        setTitle("라디오 버튼 Item Event 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.darkGray);

        ButtonGroup g = new ButtonGroup();
        for (int i = 0; i < text.length; i++) {
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }
        radio[2].setSelected(true);
        c.add(radioPanel,BorderLayout.NORTH);
        c.add(imageLabel,BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setSize(500, 500);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (radio[0].isSelected()) {
                    imageLabel.setIcon(appleIcon);
                } else if (radio[1].isSelected()) {
                    imageLabel.setIcon(pearIcon);
                } else if (radio[2].isSelected()) {
                    imageLabel.setIcon(cherryIcon);
                }
            }
        }
    }

    public static void main(String[] args) {
        new RadioButtonItemEventEx();
    }
}
