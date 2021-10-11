package Lec_1011;

public class Car {
    private int highest;
    Navigator Navi;    // 구성관계

    public Car() {
        this.highest = 140+10*(int)(Math.random()*8);
        Navi = new Navigator();
    }

    // 최고속도

    public int getHighest() {
        return highest;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    int current() {
        return (int) (Math.random() * highest + 1);
    }

}
