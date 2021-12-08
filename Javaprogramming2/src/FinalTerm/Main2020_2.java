package FinalTerm;

import java.util.Scanner;

public class Main2020_2 {
    public static int gcd(int a, int b) {
        int temp,n;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i == 0) {
                result = gcd(nums[i], nums[i + 1]);
            }else{
                result = gcd(nums[i + 1], result);
            }
        }
        System.out.println(result);

    }
}
