package week10;

public class MyInteger_10_03 {
    int value;
    MyInteger_10_03(){

    }
    MyInteger_10_03(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
    boolean isEven(){
        return value%2==0;
    }
    boolean isOdd(){
        return value%2!=0;
    }
    boolean isPrime(){
        for (int j = 2; j < (value / 2 + 1); j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value){
        return value%2==0;
    }
    public static boolean isOdd(int value){
        return value%2!=0;
    }
    public static boolean isPrime(int value){
        for (int j = 2; j < (value / 2 + 1); j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
    boolean equals(int value){
        return this.value==value;
    }
    boolean equals(MyInteger_10_03 a){
        return this.value==a.value;
    }
    public static int parseInt(char[] array){
        int number=0;
        for (int i = 0,j=array.length-1; i < array.length; i++,j--) {
            number+=(array[i]-48)*Math.pow(10,j);
        }
        return number;
    }
    public static int parseInt(String str){
        return Integer.parseInt(str);
    }
}
