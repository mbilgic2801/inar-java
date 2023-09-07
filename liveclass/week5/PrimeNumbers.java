package week5;

public class PrimeNumbers {
    public static void main(String[] args) {
        //prime sadece 1 ve kendine böl.
        // 1-100 e kadarki asal sayılar
        for (int i=2;i<101;i++){

            boolean isPrime = true;

            for(int j=2;j<(i/2+1);j++){
                if(i%j==0){
                    isPrime =false;
                }
            }
            if(isPrime)
            System.out.println(i);
        }
    }
}
