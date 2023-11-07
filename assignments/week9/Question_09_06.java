package week9;


import week8.CommonMethods;

public class Question_09_06 {
    public static void main(String[] args) {
        int[] numbers=new int[100000];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=(int)(Math.random()*100000);
        }
        StopWatch_09_06 watch = new StopWatch_09_06();
        CommonMethods.selectionSort(numbers);
        watch.end();
        System.out.printf("The execution time of sorting 100,000 numbers using selection sort: %d\nmilliseconds",watch.getElapsedTime());
    }
}
