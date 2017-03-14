package main.java.mihail_metel.homeWork04;

/*

*/


public class Main
{
    public static void main(String[] args){

        BankSystemImpl bsIMpl = new BankSystemImpl();

        USBank usBank = new USBank(1, "USA", Currency.USD, 150,
                5000, 100, 100000000000L);
        EUBank euBank = new EUBank(2, "EU", Currency.EURO, 120,
                3000, 200, 50000000000L);
        ChinaBank chinaBank = new ChinaBank(3, "China", Currency.USD, 110,
                1000, 300, 10000000000L);

        User usUser1 = new User(1,"user1", 3000, 10, "Company1", 1500, usBank );
        User usUser2 = new User(2,"user2", 1000, 15, "Company2", 2000, usBank );

        User euUser3 = new User(3,"user3", 6000, 12, "Company3", 2500, euBank );
        User euUser4 = new User(4,"user4", 1500, 22, "Company4", 3500, euBank );

        User chUser5 = new User(5,"user5", 1100, 8, "Company5", 1500, chinaBank );
        User chUser6 = new User(6,"user6", 2500, 1, "Company6", 1300, chinaBank );

        /*
        Operations
            void withdrawOfUser(User user, int amount) throws InvalidValueException;
            void fundUser(User user, int amount) throws InvalidValueException;
            void transferMoney(User fromUser, User toUser, int amount) throws InvalidValueException;
            void paySalary(User user) throws InvalidValueException;
         */

        try {
            bsIMpl.withdrawOfUser(usUser1, 500);
            bsIMpl.fundUser(usUser1, 1500);
            bsIMpl.transferMoney(usUser1, usUser2, 1000);
            bsIMpl.paySalary(usUser1);

            System.out.println(usUser1);

            bsIMpl.withdrawOfUser(usUser2, 100);
            bsIMpl.fundUser(usUser2, 5500);
            bsIMpl.transferMoney(usUser2, usUser1, 100);
            bsIMpl.paySalary(usUser2);

            System.out.println(usUser2);

            bsIMpl.withdrawOfUser(euUser3, 600);
            bsIMpl.fundUser(euUser3, 3500);
            bsIMpl.transferMoney(euUser3, euUser4, 200);
            bsIMpl.paySalary(euUser3);

            System.out.println(euUser3);

            bsIMpl.withdrawOfUser(euUser4, 200);
            bsIMpl.fundUser(euUser4, 1200);
            bsIMpl.transferMoney(euUser4, euUser3, 1500);
            bsIMpl.paySalary(euUser4);

            System.out.println(euUser4);

            bsIMpl.withdrawOfUser(chUser5, 50);
            bsIMpl.fundUser(chUser5, 150);
            bsIMpl.transferMoney(chUser5, usUser1, 100);
            bsIMpl.paySalary(chUser5);

            System.out.println(chUser5);

            bsIMpl.withdrawOfUser(chUser6, 200);
            bsIMpl.fundUser(chUser6, 500);
            bsIMpl.transferMoney(chUser6, euUser3, 10);
            bsIMpl.paySalary(chUser6);

            System.out.println(chUser6);

        } catch (InvalidValueException e) {
            System.out.println(e);
        }
    }
}
