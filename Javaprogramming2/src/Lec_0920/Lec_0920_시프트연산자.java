package Lec_0920;

public class Lec_0920_시프트연산자 {
    public static void main(String[] args) {
        byte a = 5; // 0101
        // 2를 곱하는 효과가 생김
        byte b = (byte) (a << 2); // 010100 = 16 + 4 = 20


        byte a1 = 20; // 010100
        // 2로 나누는 효과가 생김
        byte b1 = (byte) (a >> 2); // 0101 = 4 + 1 = 5

    }
}
