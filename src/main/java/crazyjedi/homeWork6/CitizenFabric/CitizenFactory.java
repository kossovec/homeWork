package crazyjedi.homeWork6.CitizenFabric;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Vlad on 06.03.2017.
 */
final public class CitizenFactory {

    private CitizenFactory() {
    }

    private static class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from England!");
        }
    }

    private static class Chinese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from China!");
        }
    }

    private static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from Russia!");
        }
    }

    private static class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from Italy!");
        }
    }

    public static Englishman getEnglishman() {

        return new Englishman();
    }

    public static Chinese getChinese() {
        return new Chinese();
    }

    public static Russian getRussian() {
        return new Russian();
    }

    public static Italian getItalian() {
        return new Italian();
    }
}
