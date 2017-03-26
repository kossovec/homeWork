package mihail_metel.homeWork06.Factory;


public class CitizenFactory {

    public static Citizen getCitizen(Residence c){
        switch (c){
            case ENGLISHMAN: return new EnglishMan();
            case CHINEESE: return new Chineese();
            case RUSSIAN: return new Russian();
            case ITALIAN: return new Italian();
            default: return null;
        }
    }

    static private class EnglishMan implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    static class Chineese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("您好!");
        }
    }

    static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Привет!");
        }
    }

    static class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Saluti!");
        }
    }
}
