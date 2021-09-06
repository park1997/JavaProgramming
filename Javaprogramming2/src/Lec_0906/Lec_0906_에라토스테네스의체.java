package Lec_0906;

import java.util.Scanner;

public class Lec_0906_에라토스테네스의체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean[] arr = new boolean[num+1];
        arr[0] = arr[1] = false;
        for (int i = 2; i <= num; i++) {
            arr[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(arr[i]) {
                for (int j = i; j <= num; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 0; i <= num; i++) {
            if (arr[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
