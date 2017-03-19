package main.java.mihail_metel.homeWork04;

//TASK 5
//        Create interface BankSystem with methods:
//        void withdrawOfUser(User user, int amount)
//        void fundUser(User user, int amount)
//        void transferMoney(User fromUser, User toUser, int amount)
//
//        void paySalary(User user)
//        And its implementation

public class BankSystemImpl implements BankSystem
{
    @Override
    public void withdrawOfUser(User user, int amount) throws InvalidValueException {
        int commission;

        if (user == null)
        {
            throw new InvalidValueException("User incorect");
        }

        commission = user.getBank().getCommission(amount);

        if (amount < 0) {
            throw new InvalidValueException("invalid withdraw amount");
        }

        if (user.getBalance() <= (commission + amount) ) {
            throw new InvalidValueException("invalid withdraw amount");
        }

        if (amount >= user.getBank().getLimitOfWithdrawal() ) {
            throw new InvalidValueException("invalid withdraw amount");
        }

        user.setBalance(user.getBalance() - amount - commission);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) throws InvalidValueException {
        int commissionFrom;
        int commissionTo;
        int limit;

        if (fromUser == null || toUser == null) {
            throw new InvalidValueException("User incorect");
        }
        if (fromUser == toUser) {
            throw new InvalidValueException("User incorect");
        }

        commissionFrom = fromUser.getBank().getCommission(amount);
        commissionTo = toUser.getBank().getCommission(amount);

        if (amount < 0) {
            throw new InvalidValueException("<0 amount");
        }
        if (fromUser.getBalance() <= (commissionFrom + amount) ) {
            throw new InvalidValueException("insufficient amount");
        }

        limit = toUser.getBank().getLimitOfFunding();
        if ( (amount >= limit) && (limit > 0) ) {
            throw new InvalidValueException("funding limit");
        }

        fromUser.setBalance(fromUser.getBalance() - amount - commissionFrom);
        toUser.setBalance(toUser.getBalance() + amount - commissionTo);
    }

    @Override
    public void fundUser(User user, int amount) throws InvalidValueException {
        int commissionTo;
        int limit;

        if (user == null) {throw new InvalidValueException("User incorrect");}

        commissionTo = user.getBank().getCommission(amount);

        if (amount < 0) {throw new InvalidValueException("<0 amount");}

        limit = user.getBank().getLimitOfFunding();
        if ( (amount >= limit) && (limit > 0) ) {throw new InvalidValueException("funding limit");}

        user.setBalance(user.getBalance() + amount - commissionTo);
    }

    @Override
    public void paySalary(User user) throws InvalidValueException {
        int commissionTo;
        int amount;
        int limit;

        if (user == null)
        {
            throw new InvalidValueException("User incorrect");
        }

        amount = user.getSalary();
        commissionTo = user.getBank().getCommission(amount);

        if (amount < 0) {
            throw new InvalidValueException("<0 amount");
        }

        limit = user.getBank().getLimitOfFunding();
        if ( (amount >= limit) && (limit > 0) ) {
            throw new InvalidValueException("funding limit");
        }

        user.setBalance(user.getBalance() + amount - commissionTo);
    }

}
