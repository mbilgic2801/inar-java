package week5;

public class Question_05_33 {
    public static void main(String[] args) {
        for(int i=1;i<=100001;i++){
            int sum=0;
            for(int j=i/2;j>=1;j--){
                if(i%j==0){
                    sum += j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
