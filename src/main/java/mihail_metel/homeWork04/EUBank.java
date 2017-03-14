package main.java.mihail_metel.homeWork04;


class EUBank extends Bank{
    private int limitOfWithdrawUsd = 2000;
    private int limitOfWithdrawEur = 2200;

    private int limitOfFundingEur = 20000;
    private int limitOfFundingUsd = 10000;

    private int monthlyRateUsd = 0;
    private int monthlyRateEur = 1;

    private int commisionUsdBelow1000 = 5;
    private int commisionUsdAbove1000 = 7;

    private int commisionEurBelow1000 = 2;
    private int commisionEurAbove1000 = 4;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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
        if (currency == Currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}