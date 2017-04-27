package mihail_metel.homeWork11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileRewriter {
    public static void main(String[] args) {
        String path = "src/main/java/mihail_metel/homeWork11/fileForRewriting.txt";
        Map<String,String> map = new HashMap<>();

        map.put("один","one");
        map.put("два","two");
        map.put("три","three");
        System.out.println(rewriteFileReplacingWords(map, path));
    }

    public static boolean rewriteFileReplacingWords(Map<String,String> map, String path) {
        String str = "";
        StringBuilder strB = new StringBuilder("");

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            int i;
            while ( (i = (br.read())) != -1) {strB.append((char)i);}
            str = strB.toString();
            for(Map.Entry<String, String> e: map.entrySet()) {
                str = str.replaceAll(e.getKey(), e.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
