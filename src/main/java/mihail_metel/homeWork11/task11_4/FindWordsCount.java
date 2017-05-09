package mihail_metel.homeWork11.task11_4;

import java.io.*;
import java.util.Scanner;

public class FindWordsCount {
    public static void main(String[] args) {
        String path = "src/main/java/mihail_metel/homeWork11/task11_4/text.txt";
        String word = "word";
        System.out.println(wordsCounter(path, word));
    }

    public static int wordsCounter(String path, String word) {
        int counter = 0;
        try (Scanner scanner = new Scanner(new FileReader(path))){

            String str;
            while (scanner.hasNext()){
                str = scanner.next();
                if (str.equals(word)){counter++;}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
