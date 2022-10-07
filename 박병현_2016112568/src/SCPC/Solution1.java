package SCPC;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution1 {
    static int Answer;

    static class DoubleHeap implements Comparable<DoubleHeap> {

        int num;
        int value;

        public DoubleHeap(int num, int value) {
            this.num = num;
            this.value = value;
        }

        public int getNum() {
            return num;
        }

        public int getValue() {
            return value;
        }

        @Override
        public int compareTo(DoubleHeap target) {
            if (this.num == target.num) {
                return this.value <= target.value ? -1 : 1;
            }else{
                return this.num <= target.num ? -1 : 1;
            }
        }
    }


    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            int N = sc.nextInt();
            PriorityQueue<DoubleHeap> heap = new PriorityQueue<>();
            int[] arr_posi = new int[N];
            for (int i = 0; i < N; i++) {
                arr_posi[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int v = sc.nextInt();

                heap.add(new DoubleHeap(v,i));
            }
            int index = 0;
            while (!heap.isEmpty()) {
                DoubleHeap h = heap.poll();
                int h_num = h.getNum();
                int h_value = h.getValue();
                Answer += Math.abs(arr_posi[h_value] - arr_posi[index]);
//                System.out.println(h_num + " " + h_value + " " +index);
                index += 1;
            }


            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
            Answer = 0;
        }

    }
}
