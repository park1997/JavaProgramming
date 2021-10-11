package Lec_1011;

public class Speedgun {
    private int theSpeed;

    void shot(Car car) {    // 스피드건 : 차속도 메시지패싱
        theSpeed = car.current();
    }
}
