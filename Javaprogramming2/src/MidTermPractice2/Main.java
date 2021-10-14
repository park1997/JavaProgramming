package MidTermPractice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1-1
        System.out.print("설정값 입력 > ");
        int a = sc.nextInt();
        System.out.printf("0x%08x",a);
        System.out.println();
        // 1-2


        // 1-3
        while (true) {
            try {
                System.out.print("설정값 입력 > ");
                int c = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("정수가 아닙니다 프로그램 종료!");
                break;
            }
        }
        sc.next();
        // 2-1
        char[] myname = {'b', 'y', 'u', 'n', 'g', 'h', 'y', 'u', 'n'};

        // char배열에 초기화되어 있는 본인 영문이름 출력
        for (int i = 0; i < myname.length; i++) {
            System.out.print(myname[i]);
        }
        System.out.println();

        System.out.print("2차원배열 가로, 세로 입력 >");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = (int) (Math.random() * myname.length);
                System.out.print(myname[num]+" ");
                arr[i][j] = myname[num];
            }
            System.out.println();
        }

        // 2-2
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print((char)arr[j][i]+" ");
            }
            System.out.println();
        }






    }
}
