package week6;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius      Fahrenheit      |      Fahrenheit      Celsius");
        System.out.println("-----------------------------------------------------------");
        for(int i=40,j=120;i>30;i--,j-=10){
            System.out.printf("%-12.1f %-15.1f %-6s %-15.1f %.2f\n",(double)i,celsiusToFahrenheit(i),"|",(double)j,fahrenheitToCelsius(j));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
}
