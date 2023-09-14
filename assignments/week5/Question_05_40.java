package week5;

public class Question_05_40 {
    public static void main(String[] args) {
        //flipping a coin for million times
        int headsCounter = 0;
        int tailsCounter = 0;
        System.out.println("Flipping a coin million times..");
        for(int i=0;i<10000000;i++){
            if(Math.random()*2<1){
                headsCounter++;
            }
            else{
                tailsCounter++;
            }
        }
        System.out.println("Heads: "+headsCounter);
        System.out.println("Tails: "+tailsCounter);
    }
}
