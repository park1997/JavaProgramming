package Lec_0927;

import java.util.Arrays;
import java.util.Scanner;

public class Lec_0920 {

    public static int[] d2tod1(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int[] temp = new int[row * col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[(col * i) + j] = arr[i][j];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // 1. 가로, 세로크기 키 입력
        // 2. 각각의 값은 두자리 랜덤수
        // 3. 2차원 -> 1차원 배열
        System.out.print("2차원배열 가로, 세로크기 입력 > ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];


        // 랜덤값을 원소에 저장
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = 10 + (int) (Math.random() * 90);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr2[] = d2tod1(arr);

        System.out.println(Arrays.toString(arr2));

    }
}
