package mihail_metel.homeWork04;

public interface BankSystem{
    void withdrawOfUser(User user, int amount) throws InvalidValueException;
    void fundUser(User user, int amount) throws InvalidValueException;
    void transferMoney(User fromUser, User toUser, int amount) throws InvalidValueException;
    void paySalary(User user) throws InvalidValueException;
}
