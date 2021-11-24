package HW_1124;

import java.io.FileInputStream;

public class Main2 {
    public static void main(String[] args) {
        byte data[]  = new byte[50];
        int idx = 0;
        int temp;

        try {
            FileInputStream fin = new FileInputStream("file.txt");
            while ((temp = fin.read()) != -1) {
                data[idx++] = (byte) temp;
            }
            fin.close();
        }catch(Exception e) {
            System.out.println("오류발생");
            return;
        }
        for(int i=0;i<idx;i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println("\n파일 읽기 완료");
    }
}
