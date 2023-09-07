package week5;

public class Question_05_20 {
    public static void main(String[] args) {
        int lineCounter=0;
        for (int i=2;i<1000;i++){

            boolean isPrime = true;

            for(int j=2;j<(i/2+1);j++){
                if(i%j==0){
                    isPrime =false;
                }
            }
            if(isPrime) {
                System.out.print(i+" ");
                lineCounter++;

                if(lineCounter%8==0) {
                    System.out.println();
                }
            }
        }
    }
}
