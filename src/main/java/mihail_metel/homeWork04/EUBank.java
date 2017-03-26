package mihail_metel.homeWork04;


class EUBank extends BankCommonFeatures {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.bankData = new BankData(2000,2200,20000,10000,0,
                1,5,7,2,4);
    }
}