package HW_0908;

import java.util.Scanner;

public class HW_0908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 배열 공간 생성
        boolean arr[] = new boolean[(2 * n)+1];
        arr[0] = arr[1] = false;    // 0 과 1은 소수가 아님

        // 0, 1을 제외한 소수인지 검증되지않은 수들을 true로 초기화
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        // 2부터 에라토스테네스의 체 적용
        for (int i = 2; i <= Math.sqrt(2 * n); i++) {
            int t = 2;
            while (i * t < (2 * n) + 1) {
                arr[i * t] = false;
                t += 1;
            }
        }

        int cnt = 0;    // 결과를 셀 count
        // 본인+1 수부터 2n+1까지 에라토스테네스로 걸러진 arr의 범위의 합을 구하기
        for (int i = n+1; i <= (2 * n); i++) {
            if (arr[i]) {
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }
}
