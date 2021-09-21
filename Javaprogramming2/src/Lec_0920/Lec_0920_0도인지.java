package Lec_0920;

public class Lec_0920_0도인지 {
    public static void main(String[] args) {
//        byte flag = 0b00001010;
//        byte flag = 0b00000110;
//        byte flag = 0xa;
//        byte flag = 0x6;
        byte flag = 6;
        if ((flag & 0b00001000) == 0) {
            System.out.println("온도는 0도 미만");
        } else {
            System.out.println("온도는 0도이상");
        }
    }
}
