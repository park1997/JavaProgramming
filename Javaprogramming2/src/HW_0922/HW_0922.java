package HW_0922;

import java.util.Scanner;


public class HW_0922 {
    static String toBinaryString(int number) {
        String zero = "00000000000000000000000000000000";
        String binary = zero + Integer.toBinaryString(number);
        return binary.substring(binary.length()-12);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            int b = sc.nextInt();
            if (b == 13) {
                System.out.println("비트 설정 종료~");
                break;
            }
            a = (a | (1 << (b-1)));
            System.out.printf("%03x\n",a);
//            System.out.println(a);
//            System.out.println(Integer.toHexString(a));
//            System.out.println(Integer.toBinaryString(a));
//            System.out.println((byte)a);
//            System.out.println(toBinaryString(1 << (b-1)));

        }
        System.out.println(Integer.toHexString(50));
    }
}
