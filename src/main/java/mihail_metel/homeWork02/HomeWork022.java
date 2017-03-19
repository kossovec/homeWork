package main.java.mihail_metel.homeWork02;

// задание:
//    Continue with BANK example
//            2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
//          Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.
//
//            Example
//
//            Input
//
//            balance = 100
//            withdrawal = 10
//
//            Output
//            OK 0.5 89.5
//
//            Input
//
//            balance = 100
//            withdrawal = 99
//
//            Output
//            NO

public class HomeWork022 {
    private static double COMISSION_PERCENT = 0.05;

    public static void main(String[] args) {
        HomeWork022 classItem = new HomeWork022();
        double balance1 = 200;
        double balance2 = 50;
        double amount = 100;

        classItem.withdraw(balance1, amount);
        amount = 49;
        classItem.withdraw(balance2,amount);
    }

    public double withdraw(double remainingFunds, double amountOfCash) {
        double commision = 0;

        if(amountOfCash >= 0) {
            commision = amountOfCash * COMISSION_PERCENT;
            System.out.println("balance = " + remainingFunds + "\nwithdrawal = " + amountOfCash);
            if( (remainingFunds - amountOfCash - commision) >= 0 ) {
                remainingFunds -= amountOfCash + commision;
                System.out.println( "OK\t" + commision + "\t" + remainingFunds );
            }
            else {
                System.out.println("No");
            }
        }
        return remainingFunds;
    }

}