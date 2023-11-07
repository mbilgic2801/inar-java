package week9;

public class Stock_09_02 {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock_09_02(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    double getChangePercent(){
        return (currentPrice-previousClosingPrice)*100/previousClosingPrice;
    }
    void printStatus(){
        System.out.printf("Stock name   : %s\n",name);
        System.out.printf("Stock symbol : %s\n",symbol);
        System.out.printf("Price-change percentage: %f\n",getChangePercent());
    }
}
