package week6;

public class Question_06_12 {
    public static void main(String[] args) {
        System.out.println("Characters per 1 to Z");
        printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for(int i=(int)ch1,j=1;i<=(int)ch2;i++,j++){
            System.out.print((char)i+" ");
            if(j%10==0){
                System.out.println();
            }
        }
    }

}
