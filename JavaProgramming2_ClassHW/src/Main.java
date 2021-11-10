import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("-".repeat(10)+"메뉴"+"-".repeat(10));
        System.out.println("1. 검색할 최신 기술 동향 입력(추가)하기");
        System.out.println("2. 검색할 최신 기술 동향 삭제하기");
        System.out.println("3. 입력된 최신 기술 동향 Crawling");
        System.out.println("4. DataBase 조회");
        System.out.println("5. Github 접속하기");
        System.out.println("6. 종료");
        System.out.println("-".repeat(20));
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Database db = new Database();
        Github git = new Github();

        System.out.println("이 코드를 실행하기 위해 필요한 환경 설정");
        System.out.println("1. chromedriver 다운로드 받기(현재 본인 컴퓨터에서 사용중인 크롬의 버전과 일치해야함)");
        System.out.println("2. Jsoup, Selenium 라이브러리 다운후 적용하기.");
        System.out.println();

        while (true) {
            menu();
            int num = sc.nextInt();
            if (num == 1) {
                System.out.print("검색하고자 하는 최신동향(기술)을 입력하세요 >");
                String tech = sc.next();
                arr.add(tech);
                db.setTech_arr(arr);
                db.showDb();
            } else if (num == 2) {
                System.out.println();
            } else if (num == 3) {
                git.crawling(db);
            } else if (num == 4) {

            } else if (num == 5) {
                git.url_open(db);
                System.out.println("웹 사이트 접속 완료.");
            } else if (num == 6) {
                System.out.println("시스템 종료");
                break;
            } else {
                System.out.println("1~6 사이 숫자를 입력해 주세요.");
            }

        }







    }
}
