package mihail_metel.homeWork04;

public class BankCommonFeatures extends Bank {

    protected BankData bankData;

    public BankCommonFeatures(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public BankData getBankData() {
        return bankData;
    }

    public void setBankData(BankData bankData) {
        this.bankData = bankData;
    }

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == Currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?bankData.getCommisionEurBelow1000():bankData.getCommisionEurAbove1000()))/100;
        }
        else if (currency == Currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?bankData.getCommisionUsdBelow1000():bankData.getCommisionUsdAbove1000()))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        switch (currency) {
            case EURO: return bankData.getLimitOfWithdrawEur();
            case USD: return bankData.getLimitOfWithdrawUsd();
            default: throw new RuntimeException("Wrong currency");
        }
    }

    @Override
    int getMonthlyRate()
    {
        switch (currency) {
            case EURO: return bankData.getMonthlyRateEur();
            case USD: return bankData.getMonthlyRateUsd();
            default: throw new RuntimeException("Wrong currency");
        }
    }

    @Override
    int getLimitOfFunding()
    {
        switch (currency) {
            case EURO: return bankData.getLimitOfFundingEur();
            case USD: return bankData.getLimitOfFundingUsd();
            default: throw new RuntimeException("Wrong currency");
        }
    }

}
