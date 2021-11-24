package HW_1124;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte data[] = new byte[50];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            data[i] = (byte) (Math.random() * 90 + 10);
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    i -= 1;
                    j = i;
                }
            }
        }

        try{
            FileOutputStream fos = new FileOutputStream("file.txt");
            for (int i = 0; i < size; i++) {
                fos.write(data[i]);
            }
        } catch (Exception e) {
            System.out.println("오류발생");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("파일 저장 완료 ");


    }
}
