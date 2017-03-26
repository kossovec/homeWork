package mihail_metel.homeWork04;

public class BankData {
    private int limitOfWithdrawUsd = 100; // TODO - remove constatnt default values
    private int limitOfWithdrawEur = 150;

    private int limitOfFundingEur = 5000;
    private int limitOfFundingUsd = 10000;

    private int monthlyRateUsd = 1;
    private int monthlyRateEur = 0;

    private int commisionUsdBelow1000 = 3;
    private int commisionUsdAbove1000 = 5;

    private int commisionEurBelow1000 = 10;
    private int commisionEurAbove1000 = 11;

    public BankData(int limitOfWithdrawUsd, int limitOfWithdrawEur, int limitOfFundingEur, int limitOfFundingUsd, int monthlyRateUsd,
                    int monthlyRateEur, int commisionUsdBelow1000, int commisionUsdAbove1000, int commisionEurBelow1000, int commisionEurAbove1000) {
        this.limitOfWithdrawUsd = limitOfWithdrawUsd;
        this.limitOfWithdrawEur = limitOfWithdrawEur;
        this.limitOfFundingEur = limitOfFundingEur;
        this.limitOfFundingUsd = limitOfFundingUsd;
        this.monthlyRateUsd = monthlyRateUsd;
        this.monthlyRateEur = monthlyRateEur;
        this.commisionUsdBelow1000 = commisionUsdBelow1000;
        this.commisionUsdAbove1000 = commisionUsdAbove1000;
        this.commisionEurBelow1000 = commisionEurBelow1000;
        this.commisionEurAbove1000 = commisionEurAbove1000;
    }

    public int getLimitOfWithdrawUsd() {
        return limitOfWithdrawUsd;
    }

    public void setLimitOfWithdrawUsd(int limitOfWithdrawUsd) {
        this.limitOfWithdrawUsd = limitOfWithdrawUsd;
    }

    public int getLimitOfWithdrawEur() {
        return limitOfWithdrawEur;
    }

    public void setLimitOfWithdrawEur(int limitOfWithdrawEur) {
        this.limitOfWithdrawEur = limitOfWithdrawEur;
    }

    public int getLimitOfFundingEur() {
        return limitOfFundingEur;
    }

    public void setLimitOfFundingEur(int limitOfFundingEur) {
        this.limitOfFundingEur = limitOfFundingEur;
    }

    public int getLimitOfFundingUsd() {
        return limitOfFundingUsd;
    }

    public void setLimitOfFundingUsd(int limitOfFundingUsd) {
        this.limitOfFundingUsd = limitOfFundingUsd;
    }

    public int getMonthlyRateUsd() {
        return monthlyRateUsd;
    }

    public void setMonthlyRateUsd(int monthlyRateUsd) {
        this.monthlyRateUsd = monthlyRateUsd;
    }

    public int getMonthlyRateEur() {
        return monthlyRateEur;
    }

    public void setMonthlyRateEur(int monthlyRateEur) {
        this.monthlyRateEur = monthlyRateEur;
    }

    public int getCommisionUsdBelow1000() {
        return commisionUsdBelow1000;
    }

    public void setCommisionUsdBelow1000(int commisionUsdBelow1000) {
        this.commisionUsdBelow1000 = commisionUsdBelow1000;
    }

    public int getCommisionUsdAbove1000() {
        return commisionUsdAbove1000;
    }

    public void setCommisionUsdAbove1000(int commisionUsdAbove1000) {
        this.commisionUsdAbove1000 = commisionUsdAbove1000;
    }

    public int getCommisionEurBelow1000() {
        return commisionEurBelow1000;
    }

    public void setCommisionEurBelow1000(int commisionEurBelow1000) {
        this.commisionEurBelow1000 = commisionEurBelow1000;
    }

    public int getCommisionEurAbove1000() {
        return commisionEurAbove1000;
    }

    public void setCommisionEurAbove1000(int commisionEurAbove1000) {
        this.commisionEurAbove1000 = commisionEurAbove1000;
    }
}
