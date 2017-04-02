/**
 * Created by Asus on 02.04.2017.
 */
public class CitizenFactory {

    static class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    static class Chineese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("嗨!");
        }
    }

    static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Привет!");
        }
    }

    static class French implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Salut");
        }
    }

    public void englishHello() {
        CitizenFactory.Englishman englishman = new Englishman();
        englishman.sayHello();
    }

    public void chineeseHello() {
        CitizenFactory.Chineese chineese = new Chineese();
        chineese.sayHello();
    }

    public void russianHello() {
        CitizenFactory.Russian russian = new Russian();
        russian.sayHello();
    }

    public void frenchHello() {
        CitizenFactory.French french = new French();
        french.sayHello();
    }

}
