package dima_slav.homeWork04;

public class Main {
    public static void main(String[] args) {
        //USBank
        //--------------------------------------------------------------------------------
        Bank usBank1 = new USBank(1001, "Canada", Currency.USD, 12, 1222, 3455555);
        Bank usBank2 = new USBank(1002, "USA", Currency.USD, 25, 20001, 250000);


        //EUBank
        //--------------------------------------------------------------------------------

        Bank euBank1 = new EUBank(1003, "Sweden", Currency.EUR, 36, 3365, 45000021);
        Bank euBank2 = new EUBank(1004, "Germany", Currency.EUR, 120, 5000, 999900000);


        //ChinaBank
        //--------------------------------------------------------------------------------

        Bank chBank1 = new ChinaBank(1005, "China", Currency.EUR, 5, 12000, 4500);
        Bank chBank2 = new ChinaBank(1006, "Japan", Currency.USD, 68, 126, 1000000000);


        //Создаем User
        //--------------------------------------------------------------------------------
        User user1 = new User(1166, "John", 1500, 25, "Google", 2000, usBank1);
        User user2 = new User(6611, "Mark", 32000, 120, "Microsoft", 4000, usBank2);
        User user3 = new User(1661, "Tomas", 500, 1, "Nokia", 1200, euBank1);
        User user4 = new User(6116, "Anna", 25000, 60, "Coca-cola", 2500, euBank2);
        User user5 = new User(6161, "Lee", 40000, 35, "Samsung", 5000, chBank1);
        User user6 = new User(1616, "Joshi", 4703.5, 2, "Toyota", 1500, chBank2);


        //Выполняем операции
        //------------------------------------------------------------------
        user1.withdrawOfUser(user1, 150);
        System.out.println();
        user3.fundUser(user3, 150);
        System.out.println();
        user4.transferMoney(user4, user6, 500);
        System.out.println();
        user5.paySalary(user5);


    }
}


