package Homework4_1;

/**
 * Created by Asus on 04.03.2017.
 */
public class ChinaBank extends Bank {

    private final int USD_MONTHLY_RATE = 1;
    private final int EUR_MONTHLY_RATE = 0;
    private final int USD_COMMISION_UNDER_1000 = 3;
    private final int USD_COMMISION_OVER_1000 = 5;
    private final int EUR_COMMISION_UNDER_1000 = 10;
    private final int EUR_COMMISION_OVER_1000 = 11;

    public ChinaBank(long id, String bankCountry, Currency currency,
                     int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees,
                avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) {
            return 100;
        } else {
            return 150;
        }
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.USD) {
            return 5000;
        } else {
            return 10000;
        }
    }

    @Override
    public int getMonthlyRate() {
        if (getCurrency() == Currency.USD) {
            return USD_MONTHLY_RATE;
        } else {
            return EUR_MONTHLY_RATE;
        }
    }

    @Override
    public int getCommission(int amount) {
        if (getCurrency() == Currency.EUR) {
            if (amount < 1000) {
                return USD_COMMISION_UNDER_1000;
            } else {
                return USD_COMMISION_OVER_1000;
            }
        } else {
            if (amount < 1000) {
                return EUR_COMMISION_UNDER_1000;
            } else {
                return EUR_COMMISION_OVER_1000;
            }
        }
    }
}
