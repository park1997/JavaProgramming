package HW_1201;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageView extends JFrame {
    ImageView(){
        setTitle("컬러영상뷰어ver0.2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(400,400);
        setVisible(true);
    }

    class MyPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int[] data = new int[400*400];
            int W = 256;
            int H = 256;
            int n = 0;
            int temp;
            try {
                FileInputStream fin = new FileInputStream("src/HW_1201/실험영상 업로드/컬러영상/girl.raw");
                while((temp = fin.read()) !=-1) {
                    data[n++] = temp;
                }
                fin.close();
            }catch(Exception e) {
                System.out.println("오류발생");
                return;
            }

            int bright = 100;
            int pix[][] = new int[400][400];
            for(int i=0;i<H;i++) {
                for(int j=0;j<W;j++) {
                    pix[i][j] = data[i*W+j]+bright;
                    if(pix[i][j]>255) {
                        pix[i][j] = 255;
                    }
                }
            }

            for(int i=0;i<H;i++) {
                for(int j=0;j<W;j++) {
                    g.setColor(new Color(pix[i][j],pix[i][j],pix[i][j]));
                    g.drawOval(20+j,20+i,1,1);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ImageView();

    }

}
