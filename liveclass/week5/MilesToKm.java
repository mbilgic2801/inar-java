package week5;

public class MilesToKm {
    public static void main(String[] args) {

        System.out.println("Miles          Kilometers     |     Kilometers          Miles");

        for(int i=1,j=125;i<11;i++,j+=5){
            System.out.printf("%-15d%-15.3f%-6s%-20d%.3f\n",i,i*1.609,"|",j,j/1.609);
        }
    }
}
