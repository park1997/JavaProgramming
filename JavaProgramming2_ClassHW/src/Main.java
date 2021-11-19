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
    public static void login(LogIn myaccount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-".repeat(10)+"로그인"+"-".repeat(10));
        System.out.print("아이디 입력 >");
        String id = sc.next();
        System.out.print("비밀번호 입력 >");
        String pw = sc.next();
        if ((id.equals(myaccount.getId())) && (pw.equals(myaccount.getPw()))) {
            myaccount.setKey(true);
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }
    }
    public static void join(LogIn my_account) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-".repeat(10)+"회원가입"+"-".repeat(10));
        System.out.print("아이디를 입력해 주세요 >");
        String id = sc.next();
        System.out.print("패스워드를 입력해 주세요 >");
        String pw = sc.next();
        System.out.println();
        my_account.setId(id);
        my_account.setPw(pw);
        System.out.println("회원가입 완료");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        Database db = new Database();
        Github git = new Github();
        LogIn my_account = new LogIn();
        System.out.println("이 코드를 실행하기 위해 필요한 환경 설정");
        System.out.println("1. chromedriver 다운로드 받기(현재 본인 컴퓨터에서 사용중인 크롬의 버전과 일치해야함 청부된 chromedriver의 버전은 96.0.4664.45(공식 빌드) (x86_64)입니다.)");
        System.out.println("2. Jsoup, Selenium, Json 라이브러리 다운 후 적용하기.");
        System.out.println();

        while (true) {
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            int num2 = sc.nextInt();
            if (num2 == 1) {
                join(my_account);
            } else if (num2 == 2) {
                login(my_account);
            }else{
                System.out.println("1 혹은 2 의 숫자를 입력해 주세요.");
            }
            while (my_account.isKey()) {
                menu();
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.print("검색하고자 하는 최신동향(기술)을 입력하세요 >");
                    String tech = sc.next();
                    arr.add(tech);
                    db.setTech_arr(arr);
                    db.showDb();
                } else if (num == 2) {
                    System.out.println("삭제할 단어의 번호를 입력해 주세요");
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println((i+1)+". "+arr.get(i));
                    }
                    int d_num = sc.nextInt();
                    System.out.println(arr.get(d_num-1)+"이 삭제되었습니다.");
                    arr.remove(d_num-1);
                    db.setTech_arr(arr);
                } else if (num == 3) {
                    git.crawling(db);
                } else if (num == 4) {
                    for(String data : arr){
                        System.out.print(data + " : ");
                        System.out.println(git.getData().get(data));
                    }
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
}
