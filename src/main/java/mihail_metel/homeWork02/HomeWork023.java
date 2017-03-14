package main.java.mihail_metel.homeWork02;

/**
 * Created by Mykhailo Metel on 03.02.2017.
 *
 You need to write method which withdraw money of particular account owner if he/she can.
 Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
 Comision is 5% for all cases.
 Example
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Ann
 double withdrawal = 100;
 Output
 Ann 100 145
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Oww
 double withdrawal = 490;
 Output
 Oww NO
 *
 */

public class HomeWork023 {

    private static double COMISSION_PERCENT = 0.05;

    public static void main(String[] args) {
        HomeWork023 classItem = new HomeWork023();
        double[] balances = {15, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};
        String ownerName;
        double amount;

        ownerName = "Vasia";
        amount = 490;
        classItem.withdrawMoney(ownerName, amount, balances, ownerNames);

        ownerName = "Petia";
        amount = 1000;
        classItem.withdrawMoney(ownerName, amount, balances, ownerNames);
    }

    private void withdrawMoney(String name, double amountOfWithdraw, double[] balancesOnAccounts, String[] namesArray) {
        double comission;

        if (amountOfWithdraw >= 0){
            for (int i = 0; i < namesArray.length; i++) {
                if ( namesArray[i].equals(name) )
                {
                    comission = amountOfWithdraw * COMISSION_PERCENT;
                    if ( (balancesOnAccounts[i] -  amountOfWithdraw - comission) >= 0){
                        balancesOnAccounts[i] -= amountOfWithdraw + comission;
                        System.out.println(namesArray[i] + "\t" + amountOfWithdraw + "\t" + balancesOnAccounts[i] );
                    }else {
                        System.out.println( namesArray[i] + "\t" + "No");
                    }
                    break;
                }
            }
        }
    }



}
