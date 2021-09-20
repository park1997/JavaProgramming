package Lec_0920;

import java.util.Arrays;
import java.util.Scanner;

public class Lec_0920_10진수to2진수 {
    public static void main(String[] args) {
        System.out.println("십진수 -> 이진수 변환");
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        byte[] bin = new byte[100];
        int cnt = 0;
        while (dec != 0) {
            bin[cnt++] = (byte) (dec % 2);
            dec = dec / 2;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(bin[cnt-i-1]);
        }

//        System.out.println(Arrays.toString(bin));

        sc.close();

    }
}
