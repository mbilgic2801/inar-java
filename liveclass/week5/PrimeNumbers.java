package week5;

public class PrimeNumbers {
    public static void main(String[] args) {
        //prime sadece 1 ve kendine böl.
        // 1-100 e kadarki asal sayılar
        int primeCounter = 0;
        for (int i=2;true;i++){

            boolean isPrime = true;
            // 2 ve 3 fora girmeyecek
            for(int j=2;j<(i/2+1);j++){
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                primeCounter++;
                if(primeCounter%10==0){
                    System.out.println();
                }
                if (primeCounter==50){
                    break;
                }
            }
        }
    }
}
