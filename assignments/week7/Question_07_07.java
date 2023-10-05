package week7;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] digits=new int[10];
        for(int i=0;i<100;i++){
            int randomDigit=(int)(Math.random()*10);
            digits[randomDigit]++;
        }
        printArray(digits);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.printf("%ds: %d\n",i,array[i]);
        }
    }
}
