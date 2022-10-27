package Day_10_07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatics {
    public List<PopulationMove> readByline2(String filename){
        List<PopulationMove> pml = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        )){
            String line;
            while ((line = br.readLine()) != null){
                // System.out.println(line);
                PopulationMove p = parse(line);
                pml.add(p);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
      return pml;
    }
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 10_000_00) {
            char c = (char) fileReader.read();
            fileContents += c;

        }
        System.out.println(fileContents);

    }

    public void readline(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader reader = new BufferedReader(fileReader);
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();

    }
    public PopulationMove parse(String data){
        String[] splitlines = data.split(",");
        Integer fromSido = Integer.valueOf(splitlines[0]);
        Integer toSido = Integer.valueOf(splitlines[6]);
        return new PopulationMove(fromSido,toSido);
    }
    void createANewFile(String filename) throws IOException{
        File file = new File(filename);
        try{
            file.createNewFile();
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        String address = "/Users/jeonghuijun/Downloads/2021_인구관련연간자료_20221007_41144.csv";
        PopulationStatics populationStatics = new PopulationStatics();
        List<PopulationMove> pml= populationStatics.readByline2(address);
        populationStatics.createANewFile("from_to.txt");
        /*for(PopulationMove pm : pml){
            System.out.printf("전입:%s, 전출:%s \n",pm.getFromSido(),pm.getToSido());
        }
        System.out.println(pml.size());

         */


    }
}
