import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Asus on 18.04.2017.
 */
public class SpeedTest {

    public static void main(String[] args) {

        List<Integer> testALInteger1000 = new ArrayList<>();
        List<Integer> testALInteger10000 = new ArrayList<>();
        List<String> testALString1000 = new ArrayList<>();
        List<String> testALString10000 = new ArrayList<>();

        List<Integer> testLLInteger1000 = new LinkedList<>();
        List<Integer> testLLInteger10000 = new LinkedList<>();
        List<String> testLLString1000 = new LinkedList<>();
        List<String> testLLString10000 = new LinkedList<>();

        long start, end;
        String test = "test";

        System.out.println("========= Arraylist add test ==========");

        start = System.nanoTime();

        for(int i = 0; i<1000; i++) {
            testALInteger1000.add(i);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist add for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALInteger10000.add(i);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist add for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testALString1000.add(test);
        }
        end = System.nanoTime();

        System.out.println("String arraylist add for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALString10000.add(test);
        }
        end = System.nanoTime();

        System.out.println("String arraylist add for 10000: " + String.format("%,12d", end - start));



        System.out.println("========= Arraylist set test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testALInteger1000.set(i, i + 5);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist set for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALInteger10000.add(i, i + 5);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist set for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testALString1000.add(i, test);
        }
        end = System.nanoTime();

        System.out.println("String arraylist set for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALString10000.add(i, test);
        }
        end = System.nanoTime();

        System.out.println("String arraylist set for 10000: " + String.format("%,12d", end - start));



        System.out.println("========= Arraylist get test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testALInteger1000.get(i);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist get for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALInteger10000.get(i);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist get for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testALString1000.get(i);
        }
        end = System.nanoTime();

        System.out.println("String arraylist get for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testALString10000.get(i);
        }
        end = System.nanoTime();

        System.out.println("String arraylist get for 10000: " + String.format("%,12d", end - start));


        System.out.println("========= Arraylist remove test ==========");

        start = System.nanoTime();
        for(int i = 0; i > 1000; i++) {
            testALInteger1000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist remove for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i > 10000; i++) {
            testALInteger10000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("Integer arraylist remove for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i > 0; i++) {
            testALString1000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("String arraylist remove for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i > 10000; i++) {
            testALString10000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("String arraylist remove for 10000: " + String.format("%,12d", end - start));



        System.out.println("========= Linkedlist add test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLInteger1000.add(i);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist add for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLInteger10000.add(i);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist add for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLString1000.add(test);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist add for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLString10000.add(test);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist add for 10000: " + String.format("%,12d", end - start));



        System.out.println("========= Linkedlist set test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLInteger1000.set(i, i + 5);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist set for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLInteger10000.add(i, i + 5);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist set for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLString1000.add(i, test);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist set for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLString10000.add(i, test);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist set for 10000: " + String.format("%,12d", end - start));



        System.out.println("========= Linkedlist get test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLInteger1000.get(i);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist get for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLInteger10000.get(i);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist get for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLString1000.get(i);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist get for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLString10000.get(i);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist get for 10000: " + String.format("%,12d", end - start));


        System.out.println("========= Linkedlist remove test ==========");

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLInteger1000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist remove for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLInteger10000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("Integer linkedlist remove for 10000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<1000; i++) {
            testLLString1000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist remove for 1000: " + String.format("%,12d", end - start));

        start = System.nanoTime();
        for(int i = 0; i<10000; i++) {
            testLLString10000.remove(0);
        }
        end = System.nanoTime();

        System.out.println("String linkedlist remove for 10000: " + String.format("%,12d", end - start));



    }

}
