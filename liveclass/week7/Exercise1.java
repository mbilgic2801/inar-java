package week7;

public class Exercise1 {
    public static void main(String[] args) {
            int[] numbers={1,4,6,8,3};
            System.out.print(bigDiff(numbers));
    }
    public static int bigDiff(int[] numbers){
        int max=numbers[0];
        int min=numbers[0];
        for(int i=0;i< numbers.length-1;i++){
            max=Math.max(max,numbers[i+1]);
            min=Math.min(min,numbers[i+1]);
        }
        return max-min;
    }
}
