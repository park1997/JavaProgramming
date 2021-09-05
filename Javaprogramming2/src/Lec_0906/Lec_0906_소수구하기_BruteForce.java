package Lec_0906;
// Brute Force

import java.util.Scanner;

public class Lec_0906_소수구하기_BruteForce {
    public static void main(String[] args) {    // entry point
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean key = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n+"은 소수가 아님");
                key = false;
            }
        }
        if (key) {
            System.out.println(n+"은 소수임");
        }
    }
}
