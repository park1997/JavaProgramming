package Lec_0913;

import java.util.Scanner;
public class Lec_0913_최대공약수 {
    public static int gcd(int num1, int num2) {
        int result = 1;
        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                result *= i;
                num1 /= i;
                num2 /= i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(gcd(num1, num2));

    }
}
