package FinalTerm;



import java.util.Scanner;

public class Main2020_1번 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "0x";
        System.out.print("정수입력> ");
        int n = sc.nextInt();

        int[] arr = new int[50];
        int count = 0;
        while (n!= 0) {
            arr[count++] = n % 16;
            n=n/16;
        }
        System.out.print(str);

        for (int j=0;j<8-count;j++) {
            System.out.print("0");
        }

        for (int i=0;i<count; i++) {
            if (arr[count-1-i] <= 9) {
                System.out.print(arr[count-1-i]);
                str += Integer.toString(arr[count-1-i]);
            }
            else if (arr[count-1-i] ==10) {
                System.out.print("a");
                str += "a";
            }
            else if (arr[count-1-i] ==11) {
                System.out.print("b");
                str += "b";
            }
            else if (arr[count-1-i] ==12) {
                System.out.print("c");
                str += "c";
            }
            else if (arr[count-1-i] ==13) {
                System.out.print("d");
                str += "d";
            }
            else if (arr[count-1-i] ==14) {
                System.out.print("e");
                str += "e";
            }
            else if (arr[count-1-i] ==15) {
                System.out.print("f");
                str+= "f";
            }
        }
        System.out.print("\n" + str.substring(0,4) + " ");
        System.out.print("0x" + str.substring(3,5) + " ");
        System.out.print("0x" + str.substring(5,7) + " ");
        System.out.print("0x" + str.substring(7,9));


    }

}
