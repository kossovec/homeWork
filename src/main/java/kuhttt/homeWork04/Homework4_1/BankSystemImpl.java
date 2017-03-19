package Homework4_1;

import java.math.BigDecimal;

/**
 * Created by Asus on 05.03.2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double comisionPerc = (double) user.bank.getCommission(amount) /100;
        BigDecimal operationResult = new BigDecimal(user.balance - (amount + amount * comisionPerc));
        BigDecimal operationResultRounded = operationResult.setScale(2,BigDecimal.ROUND_CEILING);
        if (operationResultRounded.signum() == -1) {
            throw new IllegalArgumentException("Not enough founds!");
        } else { user.balance = operationResultRounded.doubleValue(); }
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.bank.getLimitOfFunding() < amount) {
            throw new IllegalArgumentException("Error! Operation exceeded the limit!");
        } else { user.balance += amount; }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        boolean withdrawSuccess = true;
        try {
            withdrawOfUser(fromUser, amount);
        } catch (IllegalArgumentException e) { withdrawSuccess = false; }
        if(withdrawSuccess) {
            fundUser(toUser, amount);
        }
    }

    @Override
    public void paySalary(User user) {
        double monthlyRate = (double) user.bank.getMonthlyRate() / 100;
        BigDecimal perc = new BigDecimal(user.balance * monthlyRate).setScale(2, BigDecimal.ROUND_FLOOR);
        user.balance += user.salary + perc.doubleValue();
    }
}
