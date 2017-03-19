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


public class USBank extends Bank{
    private  int limitOfWithdrawUsd = 1000;
    private int limitOfWithdrawEur = 1200;

    private int limitOfFundingEur = 1200;
    private int limitOfFundingUsd = -1;

    private int monthlyRateUsd = 1;
    private int monthlyRateEur = 2;

    private int commisionUsdBelow1000 = 5;
    private int commisionUsdAbove1000 = 7;

    private int commisionEurBelow1000 = 6;
    private int commisionEurAbove1000 = 8;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == Currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?commisionEurBelow1000:commisionEurAbove1000))/100;
        }
        else if (currency == Currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?commisionUsdBelow1000:commisionUsdAbove1000))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        if (currency == Currency.EURO){
            return limitOfWithdrawEur;
        }
        else if (currency == Currency.USD) {
            return limitOfWithdrawUsd;
        }

        return 0;
    }

    @Override
    int getMonthlyRate()
    {
        if (currency == Currency.EURO){
            return monthlyRateEur;
        }
        else /*if (currency == currency.USD)*/ {
            return monthlyRateUsd;
        }
    }

    @Override
    int getLimitOfFunding()
    {
        if (currency == currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}

