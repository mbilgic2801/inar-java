package week5;

public class Quiz_01 {
    // 2,,4,,6,8,10
    public static void main(String[] args) {
        for(int i=1;i<51;i++){
            System.out.printf("%d ",i*2);
            if(i%5==0)
                System.out.println("");
        }
    }
}
