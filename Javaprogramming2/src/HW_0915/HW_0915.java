package HW_0915;

import java.util.Scanner;

public class HW_0915 {
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
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] =  sc.nextInt();
        }
        int temp = 1;
        for (int i = 0; i < num - 1; i++) {
            if (i == 0) {
                temp = gcd(arr[i], arr[i + 1]);
            } else {
                temp = gcd(temp, arr[i + 1]);
            }
        }
        System.out.println(temp);

    }
}
