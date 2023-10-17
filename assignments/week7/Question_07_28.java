package week7;

public class Question_07_28 {
    public static void main(String[] args) {
            int[] array={0,1,2,3,4,5,6,7,8,9};
          //  int[] array2={0,1,2,3,4,5,6,7};
            for(int i=0;i< array.length;i++){
                for (int j = i+1; j < array.length ; j++) {
                    System.out.printf("%d %d\n",i,j);
                }
            }
        /*int counter=0;
        for(int i=0;i< array2.length;i++){
            for (int j = i+1; j < array2.length ; j++) {
                System.out.printf("%d %d\n",i,j);
                counter++;
            }
        }
        System.out.println("counter"+counter);*/
    }
}
