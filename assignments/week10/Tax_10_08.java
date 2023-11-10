package week10;

public class Tax_10_08 {
    int filingStatus;
    final int SINGLE_FILER=0;
    final int MARRIED_JOINTLY_OR_QUALIFYING=1;
    final int MARRIED_SEPARATELY=2;
    final int HEAD_OF_HOUSEHOLD=3;
    int[][] brackets;
    double[] rates;
    double taxableIncome;

    public Tax_10_08() {
    }
    public  double computeTax() {

        int index = 0;
        for (int i = 0; i < brackets[0].length; i++) {
            if (taxableIncome > brackets[filingStatus][i]) {
                index = i + 1;
            }
        }
        double tax = 0;
        for (int i = index; i >= 0; i--) {
            if (i == index) {
                tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
            } else if (i == 0) {
                tax += brackets[filingStatus][i] * rates[i];
            } else {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            }
        }
        return tax;
    }
    public String toString(){
        return " "+computeTax();
    }
    double getTax(){
        double tax=0;

        return tax;

    }
    public Tax_10_08(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
