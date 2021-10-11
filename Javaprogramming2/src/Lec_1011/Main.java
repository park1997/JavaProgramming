package Lec_1011;

public class Main {
    public static void main(String[] args) {
        System.out.println("스피드건 모의실험");
//        Navigator iNavi = new Navigator();
//        iNavi.find();
//        iNavi.monitor();

        Car sonata = new Car();
        System.out.println("최고속도 :" + sonata.getHighest() + "Km");

        System.out.println("현재속도 :" + sonata.current() + "Km");

        int n = sonata.Navi.find();
        sonata.Navi.monitor();

        for (int i = 1; i <= n; i++) {  // 목적지까지 각각의 도로와 스피드건을 지나간다
            // 도로생성
            // 스피드건 생성
            Road road = new Road();

//            System.out.print("도로명" + i + "\t");
            // 스피드건 -> 차의 속도 : 메시지 패싱
            // 스피드건 -> monitor() : 메시지 패싱
            System.out.print("도로명"+i+"\t 제한속도:"+road.getLimit()+"\t");
            System.out.println("현재속도 :" + sonata.current() + "Km");
        }


    }
}
