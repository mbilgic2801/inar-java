package week5;

public class Question_05_11 {
    public static void main(String[] args) {
        int counter=0;
        for(int i = 100 ; i <= 200 ; i++ ){
            if( i % 6 == 0 ^ i % 5 == 0){
                System.out.print(i+" ");
                counter++;
                if( counter % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
