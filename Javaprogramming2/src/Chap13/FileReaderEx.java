package Chap13;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        try{
            fin = new FileReader("/Users/byeonghyeon/Documents/GitHub/JavaProgramming/Javaprogramming2/src/Chap13/hi.txt");
            int c ;
            while ((c = fin.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }



    }
}
