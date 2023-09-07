package week5;

public class Question_05_10 {
    public static void main(String[] args) {
        int counter=0;
        for(int i=100;i<1000;i++){
            if(i%30==0){
                System.out.print(i+" ");
                counter++;
                if(counter%10==0) {
                    System.out.println();
                }
            }

        }
    }
}
