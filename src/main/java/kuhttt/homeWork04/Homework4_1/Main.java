package Homework4_1;

import java.math.BigDecimal;

/**
 * Created by Asus on 06.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        USBank bankOfAmerica = new USBank(1,"USA", Currency.USD,
                1000, 600, 1, 3000000);

        EUBank creditAgricole = new EUBank(2, "France", Currency.EUR,
                1200, 500, 1, 4000000);

        ChinaBank bankOfChina = new ChinaBank(3,"China", Currency.USD,
                3000, 300, 20, 6600000);

        User Andrew = new User (1, "Andrew", 10000, 6,
                "Heavy Drugs Entertainment", 500, bankOfAmerica);

        User Kate = new User(2,"Kate", 20000, 20,
                "Hallucinations Pictures", 800, bankOfAmerica);

        User Sam = new User(3, "Sam", 400000, 30,
                "Eurocorp", 4000, creditAgricole);

        User Stepan = new User (4, "Stepan", 3000000, 1,
                "Dvornik Enterprise", 400000, creditAgricole);

        User Kim = new User(5, "Kim", 70000, 57,
                "Chototam Inc", 3000, bankOfChina);

        User Yan = new User(6, "Yan", 50000, 18,
                "Etovot Productions", 2000, bankOfChina);


        BankSystemImpl bankSystem = new BankSystemImpl();
        bankSystem.fundUser(Andrew, 100);
        bankSystem.withdrawOfUser(Andrew, 10);
        bankSystem.paySalary(Andrew);
        bankSystem.transferMoney(Andrew, Kate, 1000);
        bankSystem.fundUser(Kate, 200);
        bankSystem.withdrawOfUser(Kate, 200);
        bankSystem.paySalary(Kate);
        bankSystem.transferMoney(Kate, Sam, 300);
        bankSystem.fundUser(Sam, 200);
        bankSystem.withdrawOfUser(Sam, 200);
        bankSystem.paySalary(Sam);
        bankSystem.transferMoney(Sam, Stepan, 1000);
        bankSystem.fundUser(Stepan, 200);
        bankSystem.withdrawOfUser(Stepan, 200);
        bankSystem.paySalary(Stepan);
        bankSystem.transferMoney(Stepan, Kim, 1000);
        bankSystem.fundUser(Kim, 200);
        bankSystem.withdrawOfUser(Kim, 200);
        bankSystem.paySalary(Kim);
        bankSystem.transferMoney(Kim, Yan, 1000);
        bankSystem.fundUser(Yan, 200);
        bankSystem.withdrawOfUser(Yan, 200);
        bankSystem.paySalary(Yan);
        bankSystem.transferMoney(Yan, Andrew, 1000);

        System.out.println(Andrew);
        System.out.println(Kate);
        System.out.println(Sam);
        System.out.println(Stepan);
        System.out.println(Kim);
        System.out.println(Yan);
    }

}
