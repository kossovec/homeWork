package main.java.mihail_metel.homeWork02;

/**
 ДЗ №02.4
 You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
 Input
 int[] balances = {1200, 250, 2000, 500, 3200};
 String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 String ownerName = Oww
 double withdrawal = 100;
 Output
 Oww 600
 */

public class HomeWork024 {

    public static void main(String[] args) {
        String ownerName;
        double amount;
        HomeWork024 classItem = new HomeWork024();
        double[] balances = {150, 250, 2000, 500, 3200};
        String[] ownerNames = {"Vasia", "Ann", "Petia", "Oww", "Lane"};

        ownerName = "Vasia";
        amount = -10;
        classItem.fundMoney(ownerName, amount, balances, ownerNames);

        ownerName="Petia";
        amount=200;
        classItem.fundMoney(ownerName, amount, balances, ownerNames);
    }

    public void fundMoney(String name, double amountOfFunding, double[] balancesOnAccounts, String[] namesArray) {
        if (amountOfFunding >= 0) {
            for (int i = 0; i < namesArray.length; i++) {
                if (namesArray[i].equals(name))
                {
                        balancesOnAccounts[i] += amountOfFunding;
                        System.out.println(namesArray[i] + "\t" + balancesOnAccounts[i]) ;
                        break;
                }
            }
        }
        else {
            System.out.println("Error");
        }
    }

}