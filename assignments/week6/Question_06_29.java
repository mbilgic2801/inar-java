package week6;

public class Question_06_29 {
    public static void main(String[] args) {
        printTwinPrimes(1000);
    }
    public static void printTwinPrimes(int num){
        int temp1=2;
        int temp2=3;
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                temp2=temp1;
                temp1=i;
                if(temp1-temp2==2){
                    System.out.printf("(%d,%d)\n",temp2,temp1);
                }
            }
        }
    }
    public static boolean isPrime(int number){
        for (int j = 2; j < (number / 2 + 1); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
