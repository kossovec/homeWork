package mihail_metel.homeWork04;

//Abstract class Bank should contain fields
//        long id
//        String bankCountry
//        Currency currency
//        int numberOfEmployees
//        double avrSalaryOfEmployee
//        long rating
//        long totalCapital

public abstract class Bank {
    protected long id;
    protected String bankCountry;
    protected Currency currency;
    protected int numberOfEmployees;
    protected double avrSalaryOfEmployee;
    protected long rating;
    protected long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary(){
        return avrSalaryOfEmployee * numberOfEmployees;
    }

    @Override
    public String toString(){
        return this.getClass().toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
