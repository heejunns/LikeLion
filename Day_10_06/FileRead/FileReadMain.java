package Day_10_06.FileRead;

import Day_10_06.FileRead.FileRead;

import java.io.File;
import java.io.IOException;

public class FileReadMain {
    public static void main(String[] args) throws IOException {
        File dir = new File("./"); // 현재 디렉터리 파일 목록 출력
        File files[] = dir.listFiles();
        for (File file : files){
            System.out.println(file);
        }
        FileRead fileRead = new FileRead("hello.txt");
        char c1 = fileRead.oneByte(); // 한 글자 읽기
        System.out.println(c1);

        String str = fileRead.twoByte(); // 두 글자 읽기
        System.out.println(str);

        String str1 = fileRead.readNChars(10);
        System.out.println(str1);


    }
}
