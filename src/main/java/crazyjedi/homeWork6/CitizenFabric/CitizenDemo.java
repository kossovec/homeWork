package crazyjedi.homeWork6.CitizenFabric;

/**
 * Created by Vlad on 08.03.2017.
 */
public class CitizenDemo {

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
