package Chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        nameList.setVisibleRowCount(5);
        nameList.setFixedCellWidth(100);
        c.add(new JScrollPane(nameList));


        setSize(500, 500);
        setVisible(true);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                v.add(t.getText());
                t.setText("");
                nameList.setListData(v);
            }
        });
    }




    public static void main(String[] args) {
        new ListChangeEx();
    }
}
