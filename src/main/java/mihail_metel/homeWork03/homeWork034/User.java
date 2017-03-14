package main.java.mihail_metel.homeWork03.homeWork034;

public class User {

    public static void main(String[] args) {
        User userPetia = new User("Petia", 10000, 0,
                "SomeName", 3000, "UAH" );

        userPetia.monthIncreaser(1);
        System.out.println(userPetia.getMonthsOfEmployment());
        userPetia.paySalary();

        try {
            System.out.println(userPetia.companyNameLenght());
        } catch (InvalidValueException e) {
            System.out.println(e);
        }

        try {
            userPetia.withdraw(500);
        } catch (InvalidValueException e) {
            System.out.println(e);
        }

        try {
            userPetia.setCompanyName("");
        } catch (InvalidValueException e) {
            System.out.println(e);
        }


    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    private static final double comisionLow = 0.05;
    private static final double comisionHigh = 0.1;
    private static final int highLowBorder =1000;

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidValueException {
        if ( (name == null) || (name.length() == 0) ){
            throw new InvalidValueException("incorect name");
        }
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        if (monthsOfEmployment > 0){
            this.monthsOfEmployment = monthsOfEmployment;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) throws InvalidValueException {
        if ( (companyName == null) || (companyName.length() == 0) ){
            throw new InvalidValueException("incorect Company name");
        }
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary(){
        balance += salary;
    }

    public void withdraw(int summ) throws InvalidValueException {

        double comision = (summ < highLowBorder) ? comisionLow : comisionHigh;

        if( (summ < 0) || (balance - summ * (1 + comision) < 0)){
            throw new InvalidValueException("incorect sum of withdraw");
        }
        balance -= summ * (1 + comision);
    }

    public int companyNameLenght() throws InvalidValueException {
        if ( (companyName == null) || (companyName.length() == 0) ){
            throw new InvalidValueException("incorect Company name");
        }
        return companyName.length();
    }

    public void monthIncreaser(int addMonths){
        if (addMonths >= 0){
            this.monthsOfEmployment += addMonths;
        }
        else {
            System.out.println("Invalid months value");
        }
    }

}


