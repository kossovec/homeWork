package main.java.mihail_metel.homeWork04;

//        ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
//        limit of funding - 5000 if EUR and 10000 if USD
//        monthly rate - 1% with USD and 0% with EUR
//        commision - 3% if USD and up to 1000, 5% if USD and more than 1000
//        10% if EUR and up to 1000 and 11% if EUR and more than 1000

public class ChinaBank extends BankCommonFeatures {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.bankData = new BankData(100,150,5000,10000,1,0,3,5,10,11);
    }
}
