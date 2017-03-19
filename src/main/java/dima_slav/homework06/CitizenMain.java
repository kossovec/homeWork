package dima_slav.homework06;

public class CitizenMain {
    public static void main(String[] args) {
        Citizen russian = CitizenFactory.getRussian();
        Citizen chinese = CitizenFactory.getChinese();
        Citizen italian = CitizenFactory.getItalian();
        Citizen englishman = CitizenFactory.getEnglishman();

        russian.sayHello();
        chinese.sayHello();
        italian.sayHello();
        englishman.sayHello();
    }
}
