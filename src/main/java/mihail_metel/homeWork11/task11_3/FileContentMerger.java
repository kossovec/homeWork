package mihail_metel.homeWork11.task11_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public class FileContentMerger {
    public static void main(String[] args) {
        String path = "src/main/java/mihail_metel/homeWork11/task11_3/fileForMerging.txt";
        Map<String,String> map = new HashMap<>();

        map.put("123","321");
        map.put("два","two");
        map.put("три","three");

        fileContentMerger(map, path);
    }

    public static void fileContentMerger(Map<String, String> map, String filePath){

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            StringBuilder stringBuilder = new StringBuilder();

            int sym;
            while ((sym = randomAccessFile.read()) != -1) {
                stringBuilder.append((char)sym);
            }

            String str = stringBuilder.toString();
            for(Map.Entry<String, String> e: map.entrySet()) {
                str = str.replaceAll(e.getKey(), e.getValue());
            }

            randomAccessFile.write("\nend of old file part\n".getBytes());
            randomAccessFile.write(str.getBytes());
            randomAccessFile.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
