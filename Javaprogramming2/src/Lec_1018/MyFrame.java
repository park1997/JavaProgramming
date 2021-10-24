package Lec_1018;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){   // 생성자
        setTitle("300x300 스윙 프레임 만들기");

        // 컨텐드팬( 디폴트가 보더레이아웃임)
        Container cp = getContentPane();

        cp.setLayout(new FlowLayout()); // 디폴트가 보더레이아웃인데 레이아웃을 플로우레이아웃으로 바꿈
        cp.add(new JButton("OK"));
        cp.add(new JButton("Cancel"));
        cp.add(new JButton("Ignore"));

        /*
        cp.add(new JButton("OK"), BorderLayout.WEST);
        cp.add(new JButton("Cancel"), BorderLayout.CENTER);
        cp.add(new JButton("Ignore"), BorderLayout.EAST);
        */

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // x를 눌렀을때 프로그램 종료
        setSize(300, 300);  // 프레임 크기 300x300
        setVisible(true);   // 프레임 출력
    }

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();



    }
}
