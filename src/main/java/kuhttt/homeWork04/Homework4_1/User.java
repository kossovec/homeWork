package Homework4_1;

/**
 * Created by Asus on 05.03.2017.
 */
public class User {

    private long id;
    private String name;
    public double balance;
    private int monthsOfEmployment;
    private String companyName;
    public int salary;
    public Bank bank;

    public User(long id, String name, double balance,
                int monthsOfEmployment, String companyName,
                int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return  "===================" + '\n' +
                "ID: " + id + '\n' +
                "Name: " + name + '\n' +
                "Balance: " + balance + '\n' +
                "Months of employment: " + monthsOfEmployment + '\n' +
                "Company name: " + companyName + '\n' +
                "Salary: " + salary + '\n' +
                "Bank ID: " + bank.getId() + '\n' +
                "===================" + '\n';
    }
}
