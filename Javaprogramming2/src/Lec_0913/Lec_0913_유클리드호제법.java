package Lec_0913;

import java.util.Scanner;


public class Lec_0913_유클리드호제법 {
    public static long gcdHoje(long num1,long num2) {
        while (true) {
            if (num1 > num2) {
                long temp;
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            num2 %= num1;
//            System.out.print(num1+" "+num2);
//            System.out.println();
            if (num2 == 0) {
                break;
            }
        }
        return num1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println(gcdHoje(num1, num2));
    }
}
