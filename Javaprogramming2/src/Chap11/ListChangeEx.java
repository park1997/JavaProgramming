package Chap11;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(10);
    private Vector<String> v = new Vector<String>();
    private JList<String> nameList = new JList<String>();
    public ListChangeEx() {
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 입력 후  <Enter> 키"));
        c.add(tf);

        v.add("박병현");
        v.add("임채균");


    }
}
