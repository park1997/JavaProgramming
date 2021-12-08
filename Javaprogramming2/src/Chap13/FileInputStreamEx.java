package Chap13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try{
            FileInputStream fin = new FileInputStream("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt");
            int n = 0;
            int c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte) c;
                n++;
            }
            System.out.println("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt 에서 읽은 배열을 출력합니다.");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt 에서 읽지 못했습니다. 경로명을 체크해 보세요.");
        }

    }
}
