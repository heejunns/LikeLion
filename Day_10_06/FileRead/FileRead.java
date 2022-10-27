package Day_10_06.FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRead {
    private String filename;
    public FileRead(String filename) throws FileNotFoundException {
        this.filename = filename;
    }

    public char oneByte() throws IOException {

        FileReader fileReader = new FileReader(this.filename);
        return (char) fileReader.read();
    }

    public String twoByte() throws IOException { // 두 글자 읽는 메서드
        FileReader fileReader = new FileReader(this.filename);
        String str1 = "";
        for (int i = 0; i < 2; i++) {
            str1 += (char) fileReader.read();
        }
        return str1;
    }
    public String readNChars(int num) throws IOException {
        FileReader fileReader = new FileReader(this.filename);
        String str2 = "";
        for (int i = 0; i < num; i++) {
            int c = fileReader.read();
            if (c == -1) {
                return str2;
            }
            str2 += String.valueOf((char)c);
        }
          return str2;
    }
}


