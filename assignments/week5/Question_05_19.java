package week5;

public class Question_05_19 {
    public static void main(String[] args) {
        int times=8;
        for(int s=0;s<8;s++) {
            for(int j=times-s;j>0;j--){
                System.out.print("    ");
            }
            for (int i = -1*s; i < s+1; i++) {
                System.out.printf(" %3d",(int) Math.pow(2, s - Math.abs(i)));
            }
            System.out.println();
        }

    }
}
