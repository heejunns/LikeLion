package Day_10_07;

import java.io.FileReader;
import java.io.IOException;

public class PopulationStatics_Read_10_000_000 {
    public static void main(String[]args) throws IOException {
        String address ="/Users/jeonghuijun/Downloads/2021_인구관련연간자료_20221007_41144.csv";
        FileReader fileReader = new FileReader(address);

       String fileContents = "";
       while (fileContents.length() < 10_000_00){
           char c = (char)fileReader.read();
           fileContents += c;

       }
        System.out.println(fileContents);
    }

}
