package HW_class;

import java.util.Scanner;


public class Main {
    public static void menu() {
        System.out.println("-".repeat(10)+"메뉴"+"-".repeat(10));
        System.out.println("1. 한국어 -> 영어 번역");
        System.out.println("2. 영어 -> 한국어 번역");
        System.out.println("3. 맞춤법 검사기");
        System.out.println("4. Data 조회");
        System.out.println("4. 종료");
    }
    public static void menu2() {
        System.out.println("1. 한국어 -> 영어 번역 Data");
        System.out.println("2. 영어 -> 한국어 번역 Data");
        System.out.println("3. 맞춤법 검사 Data");
        System.out.println("4. 종료");
    }
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Translater translater = new Translater();
        SpellChecker spellchecker = new SpellChecker();
        DataBase db = new DataBase();
        db.setPassword("1234"); // db비밀번호를 설정한다.

        /*
        Option의 default값
        headless = false
        interval = 1000 => 인터벌 숫자가 너무 짧으면 각 로컬 컴퓨터 환경에따라 결과값이 안나오는 경우 생길 수도 있음
        window size : 1920x1080
         */
        // 첫번째 옵션 객체
        Option option1 = new Option();
        option1.setWidth(1500); // width와 height를 option을 통해 바꿀 수 있음
        option1.setHeight(1500);

        // 두번째 옵션 객체
        Option option2 = new Option();
        option2.setHeadless(true);  // option2는 chrome 창이 보이지 않도록 함
        option2.setInterval(1500);  // option2의 interval을 1.5초로 늘려줌 (본인 컴퓨터의 성능이 안좋을 경우 초를 늘려주자)

        // 세번째 옵션 객체
        Option option3 = new Option();

        while (true) {
            menu();
            int num = sc.nextInt();
            if (num == 1) {
                System.out.print("번역할 한국어를 입력해 주세요. >");
                sc.nextLine();
                String text_k = sc.nextLine();  // 한국어 입력
                String result = translater.translate_KtoE(text_k, option1);
                System.out.println(text_k + " -> " + result); // 한국말이 영어로 번역됨
            } else if (num == 2) {
                System.out.print("번역할 영어를 입력해 주세요. >");
                sc.nextLine();
                String text_e = sc.nextLine();  // 영어 입력
                String result = translater.translate_EtoK(text_e, option2);
                System.out.println(text_e + " -> " + result); // 영어가 한국말로 번역됨
            } else if (num == 3) {
                System.out.print("맞춤법을 수정할 문장을 입력해 주세요. >");
                sc.nextLine();
                String text = sc.nextLine();
                String result = spellchecker.checker(text,option3);
                System.out.println(text + " -> " + result);
            } else if (num == 4) {
                System.out.print("DataBase Password를 입력하세요 >");
                String pw = sc.next();
                if (db.getPassword().equals(pw)) {
                    while (true) {
                        menu2();
                        System.out.println("조회할 메뉴를 선택하세요 >");
                        int d_num = sc.nextInt();
                        if (d_num == 1) {
                            System.out.println(db.getK_len()+" "+db.getK_list()[0]);
                            for (int i = 0; i < db.getK_len(); i++) {
                                System.out.print(db.getK_list()[i]+" ");
                            }
                        } else if (d_num == 2) {
                            for (int i = 0; i < db.getE_len(); i++) {
                                System.out.print(db.getE_list()[i] + " ");
                            }
                        } else if (d_num == 3) {
                            for (int i = 0; i < db.getC_len(); i++) {
                                System.out.print(db.getC_list()[i]+" ");
                            }
                        } else if (d_num == 4) {
                            System.out.println("DB조회를 종료 합니다.");
                            break;
                        }else{
                            System.out.println("1~4의 번호를 입력해 주세요.");
                        }
                    }
                }else{
                    System.out.println("비밀번호가 틀렸습니다.");
                }
            }else{
                System.out.println(num+" <- 은 존재하지 않는 명령어 입니다. 1 ~ 4 의 숫자를 입력해 주세요.");
            }
        }

    }
}
