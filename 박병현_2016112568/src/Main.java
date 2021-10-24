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
        System.out.print("설정할 비트 위치 (32~1) > ");
        int b = sc.nextInt();
        System.out.printf("0x%08x",a | (1 << (b-1)));
        System.out.println();

        // 2-1
        System.out.print("2차원배열 개로, 세로 입력 > ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int data[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = (int) (Math.random() * (90)) + 10;
                data[i][j] = num;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 2-2
        for (int i = 0; i < col; i++) {
            for (int j = row - 1; j >= 0; j--) {
                System.out.print(data[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 3-1
        Leaf leaf = new Leaf(250);
        leaf.show();

        // 3-2
        Plants basil = new Plants(20,300);
        basil.show();

    }
}
