package week7;

import java.util.Arrays;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] array=new int[100000];
        int[] array2=new int[100000];;
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100000);
            array2[i]=(int)(Math.random()*100000);
        }

        int key=(int)(Math.random()*100000);
        //int[] array2={-1,0,22,3,-16,2,3,78,-109};
        //System.out.println(Arrays.toString(array2));
        sortMethod(array);
        sortArray(array);
        //System.out.println(Arrays.toString(array2));
        //getLinearSearchTime(array,key);
        //getBinarySearchTime(array,key);

    }
    public static void sortMethod(int[] array){
        long startTime=System.currentTimeMillis();
        Arrays.sort(array);
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime));
    }
    private static void getBinarySearchTime(int[] array, int key) {

        int index=-1;

        sortArray(array);
        long startTime =System.currentTimeMillis();
        int low=0;
        int high=array.length-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if(key>array[mid]){
                low=mid+1;
            }
            else if(key<array[mid]){
                high=mid-1;
            }
            else {
                index=mid;
                break;
            }
        }
        long endTime=System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.printf("Execution time of invoking the binarySearch in milliseconds: %d and index %d\n",executionTime,index);
    }

    private static void sortArray(int[] array) {
       // Arrays.sort(array);//sonra yazıcam kodu
        selectionSort(array);
    }

    public static void getLinearSearchTime(int[] array,int key){
        long startTime =System.currentTimeMillis();
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                index=i;
                break;
            }
        }
        long endTime=System.currentTimeMillis();
        long executionTime=endTime-startTime;
        System.out.printf("Execution time of invoking the lineSearch in milliseconds: %d and index %d\n",executionTime,index);


    }

    public static void selectionSort(int[] array){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < array.length-1 ; i++) {
            int min=array[i];
            int index=i;
            for (int j = i+1; j < array.length ; j++) {
                if(min>array[j]){
                    min=array[j];
                    index=j;

                }
            }
            array[index]=array[i];
            array[i]=min;

        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime));

    }
}
