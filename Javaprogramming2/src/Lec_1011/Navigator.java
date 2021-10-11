package Lec_1011;

public class Navigator {
    private int shortest;
    // 5개에서 10개 이내의 도로
    int find() {
        shortest = 5 + (int) (Math.random() * 6);
        return shortest;
    }
    void monitor() {
        System.out.println("-".repeat(10)+"네비화면"+"-".repeat(10));
        System.out.println("목적지까지 도로개수 : "+shortest);
        System.out.println("-".repeat(10)+"네비화면"+"-".repeat(10));
    }
}
