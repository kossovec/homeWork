package main.java.mihail_metel.homeWork04;

// USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
//        limit of funding - 10000 if EUR and no limit if USD
//        monthly rate - 1% with USD and 2% with EUR
//        commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//        6% if EUR and up to 1000 and 8% if EUR and more than 1000
//        EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
//        limit of funding - 20000 if EUR and 10000 if USD
//        monthly rate - 0% with USD and 1% with EUR
//        commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//        2% if EUR and up to 1000 and 4% if EUR and more than 1000


public class USBank extends BankCommonFeatures {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.bankData = new BankData(1000, 1200, 1200, -1, 1,
                2,5,7,6,8);
    }
}

