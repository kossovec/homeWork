package crazyjedi.homeWork11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * Created by Vlad on 29.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        currentDir+="/src/main/java/crazyjedi/homeWork11";
        //TASK1 READ AND REPLACE
        Path path= FileSystems.getDefault().getPath(currentDir,"/demo.txt");
        HashMap<String,String> map = new HashMap<>();
        map.put("some","replacedSome");
        String correctedString = FileManager.replace(map,path);
        System.out.println(correctedString);

        //TASK1 READ AND REPLACE
        FileManager.fileReplacer(map,path);

        //TASK3 READ REPLACE APPEND
        Path newPath= FileSystems.getDefault().getPath(currentDir,"/demo1.txt");
        FileManager.fileReplacer(map,newPath,true);

        //TASK4 READ AND CALCULATE A WORD DENSITY
        System.out.println(FileManager.wordDensity("line",newPath));




    }




}
