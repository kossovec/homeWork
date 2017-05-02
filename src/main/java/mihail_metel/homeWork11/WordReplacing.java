package mihail_metel.homeWork11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordReplacing {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        File file = new File("src/main/java/mihail_metel/homeWork11/text.txt");

        map.put("один","one");
        map.put("два","two");
        map.put("три","three");

        System.out.println(stringReplacer(file, map));
    }

    public static String stringReplacer(File file, Map<String, String> map){
        StringBuilder txt = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {txt.append(scanner.nextLine() + "\n");}
            scanner.close();
        } catch (FileNotFoundException e) {e.printStackTrace();}

        String str = txt.toString();
        for(Map.Entry<String, String> e: map.entrySet()) {
            str = str.replaceAll(e.getKey(), e.getValue());
        }
        return str;
    }
}
