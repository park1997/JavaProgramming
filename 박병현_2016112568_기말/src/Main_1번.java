import java.util.Scanner;

public class Main_1번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = 0;
        int b = 0;
        while (true) {
            if (a > 100 || b > 100) {
                System.out.println(false);
                break;
            }
            if (a * a + b * b < c) {
                a += 1;
                continue;
            } else if (a * a + b * b > c) {
                a = 1;
                b += 1;
                continue;
            } else if (a * a + b * b == c) {
                System.out.println(true);
                break;
            }


        }
    }
}
