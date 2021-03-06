package AllTasks.Bank;

import AllTasks.Currency.Currency;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if(getCurrency().equals(Currency.USD)){
            withdrawal=2000;}
        else if(getCurrency().equals(Currency.EUR)){
            withdrawal=2200;
        }
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding=0;
        if(getCurrency().equals(Currency.USD)){
            limitOfFunding = 10000;
        }
        else if (getCurrency().equals(Currency.EUR)){
            limitOfFunding = 20000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if(getCurrency().equals(Currency.USD)){
            monthlyRate=0;
        }
        else if(getCurrency().equals(Currency.EUR)){
            monthlyRate=1;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int comission=0;
        if (getCurrency().equals(Currency.USD)){
            if(summ<1000){
                comission=5;
            }else if(summ>1000){
                comission=7;
            }
        }
        else if(getCurrency().equals(Currency.EUR)){
            if (summ<1000){
                comission=2;
            }else if (summ>1000){
                comission=4;
            }
        }
        return comission;
    }
}
