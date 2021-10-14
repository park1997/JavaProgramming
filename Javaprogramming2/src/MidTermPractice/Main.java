package MidTermPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1-1
        System.out.print("원데이터와 패스워드 입력>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("\t전송데이터:"+(a ^ b));

        // 1-2
        System.out.println("전송데이터와 패스워드 입력>");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("\t복원데이터:"+(c ^ d));

        // 2-1
        String[][] arr = new String[10][10];
        String myname = "박병현";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int r = (int)(Math.random()*9);
                if (r <= 3) {
                    arr[i][j] = myname.substring(0,1);
                } else if (r > 6) {
                    arr[i][j] = myname.substring(1,2);
                } else {
                    arr[i][j] = myname.substring(2,3);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 2-2
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = 0; j < arr[0].length-2; j++) {
                temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                if (temp.equals(myname)) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);

        // 3-1
        Heal hiheal = new Heal(52, "하이힐");
        hiheal.show();

        // 3-2
        Shoes nike = new Shoes(270, 21, "Nike Air");
        nike.show();
    }
}
