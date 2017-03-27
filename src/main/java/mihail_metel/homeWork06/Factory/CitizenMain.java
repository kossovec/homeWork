package mihail_metel.homeWork06.Factory;


public class CitizenMain {
    public static void main(String[] args) {
        Citizen en = CitizenFactory.getCitizen(Residence.ENGLISHMAN);
        Citizen ch = CitizenFactory.getCitizen(Residence.CHINEESE);
        Citizen ru = CitizenFactory.getCitizen(Residence.RUSSIAN);
        Citizen it = CitizenFactory.getCitizen(Residence.ITALIAN);

        en.sayHello();
        ch.sayHello();
        ru.sayHello();
        it.sayHello();
    }
}
