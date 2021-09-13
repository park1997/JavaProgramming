package Lec_0913;

import java.util.Scanner;

public class Lec_0913_약수출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
