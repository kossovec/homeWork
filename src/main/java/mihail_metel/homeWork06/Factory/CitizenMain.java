package mihail_metel.homeWork06.Factory;


public class CitizenMain {
    public static void main(String[] args) {
        Citizen e = CitizenFactory.getCitizen(Residence.ENGLISHMAN);
        Citizen c = CitizenFactory.getCitizen(Residence.CHINEESE);
        e.sayHello();
        c.sayHello();
    }
}
