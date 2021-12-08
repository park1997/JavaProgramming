package Chap13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try{
            FileOutputStream fout = new FileOutputStream("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt");
            for (int i = 0; i < b.length; i++) {
                fout.write(b[i]);
            }
        } catch (IOException e) {
            System.out.println("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt 에 저장할 수 없었습니다. 경로명을 확인해 주세요.");
            return;
        }
        System.out.println("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi3.txt 을 저장 하였습니다.");

    }
}
