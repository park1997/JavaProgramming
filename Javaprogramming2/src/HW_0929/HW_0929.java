package HW_0929;

import java.util.Scanner;

public class HW_0929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String word[][] = {{"planet", "행성"},{"alchemist","연금술사"},
                {"industry","산업"},{"research","연구"},{"car","자동차"},
                {"book","책"},{"name","이름"},{"apple","사과"},{"bed","침대"},
                {"banana","바나나"}};

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i][0]+" "+word[i][1]);
        }
        System.out.println();

        while (true) {
            int index = (int)(Math.random()*10);
            System.out.print(word[index][1] + " >");
            String ans = sc.next();
            if (word[index][0].equals(ans)) {
                System.out.println("YES");
                score += 1;
            } else {
                System.out.println("NO");
                score -= 1;
            }
            if (score == -3) {
                System.out.println("Fail!");
                break;
            } else if (score == 3) {
                System.out.println("PASS!");
                break;
            }
        }

    }
}
