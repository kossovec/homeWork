package crazyjedi.homeWork11;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Vlad on 29.04.2017.
 */
public class FileManager {

    private static String readFile(Path path) {
        String result = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path.toString()));
            String line;
            result = "";
            while ((line = br.readLine()) != null) {
                result += line+"\n";
            }
            return result;
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static void writeFile(Path path, String content, boolean append) {
        File f = new File(path.toString());
        BufferedWriter bw = null;
        try {
            f.getParentFile().mkdirs();
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bw = new BufferedWriter(new FileWriter(f,append));
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeFile(Path path, String content) {
        File f = new File(path.toString());
        BufferedWriter bw = null;
        try {
            f.getParentFile().mkdirs();
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    static String replace(Map<String, String> map, Path path) {
        Charset charset = Charset.forName("UTF-8");
        String result = readFile(path);
        if (result == null) {
            return null;
        }
//        System.out.println("Initial string:");
//        System.out.println(result);
        for (HashMap.Entry<String, String> val : map.entrySet()) {
            result = result.replace(val.getKey(), val.getValue());
        }
//        System.out.println("Final string:");
//        System.out.println(result);
        return result;

    }

    static void fileReplacer(Map<String, String> map, Path path) {
        String replacedString = replace(map, path);
        writeFile(path, replacedString);
    }

    static void fileReplacer(Map<String, String> map, Path path, boolean append) {
        String replacedString = replace(map, path);
        writeFile(path, "\n"+replacedString,append);
    }

    static int wordDensity(String word, Path path){

        String fileContent = readFile(path);
        if(fileContent==null){
            return 0;
        }
        Scanner sc = new Scanner(fileContent);
        sc.useDelimiter("\\W");
        int counter = 0;
        while(sc.hasNext()){
            if(sc.next().equals(word)) counter++;
        }
        return counter;
    }

}
