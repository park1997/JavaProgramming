package HW_0901;

import java.util.Scanner;

public class HW_0901 {
    public static void menu(){
        System.out.println("*".repeat(10));
        System.out.println("1. 예금");
        System.out.println("2. 출금");
        System.out.println("3. 조회");
        System.out.println("4. 종료");
        System.out.println("*".repeat(10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        int option = 0;
        while(option!=4){
            menu();
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("입금할 돈을 입력하세요.");
                    int add = sc.nextInt();
                    money += add;
                    break;
                case 2:
                    System.out.println("출금할 금액을 입력하세요.");
                    int minus = sc.nextInt();
                    if (minus > money) {
                        System.out.println("현재 잔액은 " + money + "입니다 잔액이 부족하여 출금할 수 없습니다.");
                    }else{
                        money -= minus;
                        System.out.println(minus+"원 출금 완료");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액은 "+money+"원 입니다.");
                    break;
                case 4:
                    System.out.println("종료 되었습니다.");
                    break;
            }
        }

    }
}
