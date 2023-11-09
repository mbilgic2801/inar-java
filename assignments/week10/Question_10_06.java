package week10;

public class Question_10_06 {
    public static void main(String[] args) {
        StackOfInteger_10_05 prime=new StackOfInteger_10_05();
        for (int i = 2; i <120 ; i++) {
            if(Question_10_05.isPrime(i)){
                prime.push(i);
            }
        }
        int a= prime.getSize();
        for (int i = 0; i < a; i++) {
            System.out.print(prime.pop()+" ");
            if(i==23){
                System.out.println();
            }
        }
    }
}
